package com.example.retrofit.di

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.retrofit.R
import com.example.retrofit.databinding.FragmentOnBoardingBinding
import com.example.retrofit.onBoarding.SharedPreferencesManager

class OnBoarding : Fragment() {
    lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            SharedPreferencesManager.setOnboardingFinished(requireContext(), true)

// Проверка, завершен ли onboarding
            if (SharedPreferencesManager.isOnboardingFinished(requireContext())) {
                findNavController().navigate(R.id.action_onBoarding_to_mainActivity)
            } else {
                findNavController().navigate(R.id.action_onBoarding_to_viewPagerFragment)
            }

        }, 2000)
        binding=FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }


}