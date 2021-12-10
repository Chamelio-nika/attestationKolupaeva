package nika.thefirst1.foraccreditationkolupaeva

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecordsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

 private val recordsmentextview: TextView = this.itemView.findViewById(R.id.recordsmen_textview)

fun bind (name: String) {
 recordsmentextview.text = name
}

}