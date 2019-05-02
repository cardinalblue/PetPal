package com.cardianlblue.petpal

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sitter.*

open class SitterFragment : Fragment() {

    private lateinit var sitterAdapter: SitterAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sitter, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sitterAdapter = SitterAdapter()
        setSitters(
            listOf(
                Sitter("Eric"),
                Sitter("Allen"),
                Sitter("Mary"),
                Sitter("White"),
                Sitter("Momo")
            )
        )
        recyclerSitter.adapter = sitterAdapter
        recyclerSitter.layoutManager = LinearLayoutManager(context)
    }

    private fun setSitters(sitters: List<Sitter>) {
        sitterAdapter.sitters.addAll(sitters)
        sitterAdapter.notifyDataSetChanged()

    }
}