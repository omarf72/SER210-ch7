package com.example.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,container : ViewGroup?,
                              savedInstanceState:Bundle?):View{
        val view= inflater.inflate(R.layout.fragment_welcome, container,false)
        val startButton=view.findViewById<Button>(R.id.start)

        startButton.setOnClickListener{
            view.findNavController()
                .navigate(R.id.action_welcomeFragment_to_messageFragment1)
        }
        return view
    }
}