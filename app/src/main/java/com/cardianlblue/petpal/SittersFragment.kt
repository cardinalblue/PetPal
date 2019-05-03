package com.cardianlblue.petpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_sitter.*

private const val SORT_REVIEW = 0
private const val SORT_RANKING = 1

open class SittersFragment : Fragment() {

    private lateinit var sitterAdapter: SitterAdapter
    private val sitterRepository = SitterRepository()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sitter, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()
        setSpinners()

        val pagerAdapter = SitterDetailPagerAdapter(childFragmentManager!!, sitterRepository.getSitters())
        pagerSitterDetail.adapter = pagerAdapter
        pagerSitterDetail.offscreenPageLimit = 10

        spinnerSort.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position == SORT_REVIEW) {
                    val sitters = sitterRepository.getSitters().sortedByDescending { it.reviews }
                    setSitters(sitters)
                } else if (position == SORT_RANKING) {
                    val sitters = sitterRepository.getSitters().sortedByDescending { it.stars }
                    setSitters(sitters)
                }
            }
        }

        sitterAdapter.onSitterItemClicked = { position ->
            openSitterDetail(position)
        }
    }

    private fun setRecyclerView() {
        sitterAdapter = SitterAdapter()
        setSitters(
            sitterRepository.getSitters()
        )
        recyclerSitter.adapter = sitterAdapter
        recyclerSitter.layoutManager = LinearLayoutManager(context)
    }

    private fun setSitters(sitters: List<Sitter>) {
        sitterAdapter.sitters.clear()
        sitterAdapter.sitters.addAll(sitters)
        sitterAdapter.notifyDataSetChanged()
    }

    private fun setSpinners() {
        val sortBy = arrayOf("Most Reviews", "Top Ranking")
        val sortAdapter = ArrayAdapter<String>(context!!, R.layout.item_spinner_sitter_sort, sortBy)
        spinnerSort.adapter = sortAdapter
    }

    private fun openSitterDetail(position: Int) {
        pagerSitterDetail.currentItem = position
        pagerSitterDetail.pageMargin = 14.dpToPx().toInt()
        pagerSitterDetail.visibility = View.VISIBLE
        viewOverlay.visibility = View.VISIBLE

        viewOverlay.setOnClickListener {
            pagerSitterDetail.visibility = View.GONE
            viewOverlay.visibility = View.GONE
        }
    }
}