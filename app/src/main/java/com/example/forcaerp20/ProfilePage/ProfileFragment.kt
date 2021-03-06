package com.example.forcaerp20.ProfilePage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.forcaerp20.R


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view= inflater.inflate(R.layout.fragment_profile, container, false)
//        val TV2= view.findViewById<TextView>(R.id.TV2)
//        TV2.setOnClickListener { Navigation.findNavController(view).navigate(R.id.profileToHome) }
        val editProfilebtn :Button = view.findViewById(R.id.editProfile_btn)
        editProfilebtn.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.NavigateToEditProfile)

        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}