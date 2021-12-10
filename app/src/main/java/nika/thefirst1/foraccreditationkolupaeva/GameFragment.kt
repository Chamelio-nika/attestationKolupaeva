package nika.thefirst1.foraccreditationkolupaeva

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class GameFragment : Fragment() {

    private lateinit var textView:  TextView
    private lateinit var eggleft: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_game, container, false)
        // Inflate the layout for this fragment


        var counter: Int = 0
        val textView: TextView = view.findViewById(R.id.textView)
        val buttonleft: Button = view.findViewById(R.id.egg_left)
        val buttonright: Button = view.findViewById(R.id.egg_right)




        buttonleft.setOnClickListener {
            textView.text = "Волк собрал ${++counter} яиц"
        }
        buttonright.setOnClickListener {
            textView.text = "Волк собрал${++counter} яиц"
        }




        return view
    }



    }
