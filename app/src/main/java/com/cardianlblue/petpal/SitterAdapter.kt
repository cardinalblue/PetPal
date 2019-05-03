package com.cardianlblue.petpal

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_sitter.view.*


class SitterAdapter : RecyclerView.Adapter<SitterViewHolder>() {

    var sitters: MutableList<Sitter> = mutableListOf()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): SitterViewHolder {
        val context = viewGroup.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_sitter, viewGroup, false)
        return SitterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sitters.size
    }

    override fun onBindViewHolder(viewHolder: SitterViewHolder, position: Int) {
        val sitter = sitters[position]
        with(viewHolder) {
            textName.text = sitter.name
            textDistance.text = "${sitter.distance} miles"
            textStar.text = "${sitter.stars} stars, ${sitter.reviews} reviews"

            for (s in 0..4) {
                if (sitter.stars > s + 0.5) {
                    imageArray[s].setImageResource(R.drawable.star_gold)
                } else {
                    imageArray[s].setImageResource(R.drawable.star_silver)
                }
            }
        }
    }
}

class SitterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val textName = itemView.textName
    val textDistance = itemView.textDistance
    val textStar = itemView.textStar
    val imageArray = arrayOf(itemView.imageStart1, itemView.imageStart2, itemView.imageStart3, itemView.imageStart4, itemView.imageStart5)
}