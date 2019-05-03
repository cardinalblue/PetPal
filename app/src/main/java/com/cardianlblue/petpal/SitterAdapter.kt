package com.cardianlblue.petpal

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_sitter.view.*


class SitterAdapter : RecyclerView.Adapter<SitterViewHolder>() {

    var sitters: MutableList<Sitter> = mutableListOf()
    var onSitterItemClicked: (Int) -> Unit = {}

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
            textStar.text = "${sitter.stars} start, ${sitter.reviews} reviews"

            if (sitter.stars > 1) {
                imageStart1.setImageResource(R.drawable.star_gold)
            } else {
                imageStart1.setImageResource(R.drawable.star_silver)
            }

            itemView.setOnClickListener {
                onSitterItemClicked.invoke(position)
            }
        }
    }
}

class SitterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val textName = itemView.textName
    val textDistance = itemView.textDistance
    val textStar = itemView.textStar
    val imageStart1 = itemView.imageStart1

}