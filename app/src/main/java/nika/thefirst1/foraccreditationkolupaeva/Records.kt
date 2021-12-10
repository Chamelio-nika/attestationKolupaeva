package nika.thefirst1.foraccreditationkolupaeva

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Records : Fragment() {

    lateinit var recordsRecyclerView: RecyclerView
    lateinit var moregamesButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_records, container, false)
        val recordsmen_list: List<String> = listOf("Rabbit", "Wolf")

        recordsRecyclerView = view.findViewById(R.id.records_recyclerview)
        recordsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recordsRecyclerView.adapter = RecordsAdapter(recordsmen_list)

        moregamesButton.setOnClickListener {
            val link = Uri.parse("https://yandex.ru/games/play/97844")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }
}