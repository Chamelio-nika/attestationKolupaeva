package nika.thefirst1.foraccreditationkolupaeva

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class RecordsAdapter(private val recordsmen_list: List<String>):RecyclerView.Adapter<RecordsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordsViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.records_list_item, parent, false)
        return RecordsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecordsViewHolder, position: Int) {
        val name = recordsmen_list[position]
        holder.bind(name)
    }

    override fun getItemCount():Int {
        return recordsmen_list.size
    }
}

private operator fun Any.get(position: Unit) {

}
