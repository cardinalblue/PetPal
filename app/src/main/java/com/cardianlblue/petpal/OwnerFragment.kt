package com.cardianlblue.petpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sitter.*

open class OwnerFragment : Fragment() {

    private lateinit var ownerAdapter: OwnerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_owner, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ownerAdapter = OwnerAdapter()
        setOwners(
            listOf(
                Owner("Yanbin"),
                Owner("Allen"),
                Owner("Cersei"),
                Owner("Vic"),
                Owner("Tally"),
                Owner("Nichelle")
            )
        )
        recyclerSitter.adapter = ownerAdapter
        recyclerSitter.layoutManager = LinearLayoutManager(context)
    }

    private fun setOwners(owners: List<Owner>) {
        ownerAdapter.owners.addAll(owners)
        ownerAdapter.notifyDataSetChanged()

    }
}