package com.cardianlblue.petpal

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_sitter.view.*


class OwnerAdapter : RecyclerView.Adapter<OwnerViewHolder>() {

    var owners: MutableList<Owner> = mutableListOf()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): OwnerViewHolder {
        val context = viewGroup.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_sitter, viewGroup, false)
        return OwnerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return owners.size
    }

    override fun onBindViewHolder(viewHolder: OwnerViewHolder, position: Int) {
        val owner = owners[position]
        with(viewHolder) {
            textName.text = owner.name
        }
    }
}

class OwnerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val textName = itemView.textName

}