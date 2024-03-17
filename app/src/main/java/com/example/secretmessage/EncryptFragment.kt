package com.example.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 * Use the [EncryptFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EncryptFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view= inflater.inflate(R.layout.fragment_encrypt, container, false)

        val message=EncryptFragmentArgs.fromBundle(requireArguments()).message
        val encryptedView=view.findViewById<TextView>(R.id.encrypted_message)
        encryptedView.text=message.reversed()
        return view
    }


}