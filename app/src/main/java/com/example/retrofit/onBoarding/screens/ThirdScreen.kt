package com.example.retrofit.onBoarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.retrofit.R
import com.example.retrofit.di.OnBoarding
import com.example.retrofit.onBoarding.SharedPreferencesManager

class ThirdScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_third, container, false)
        val next3=view.findViewById<TextView>(R.id.next3)
        next3.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_mainActivity)
            onBoardingFinished()
        }

        return view
    }
    private fun onBoardingFinished() {
        SharedPreferencesManager.setOnboardingFinished(requireContext(), true)

    }


}