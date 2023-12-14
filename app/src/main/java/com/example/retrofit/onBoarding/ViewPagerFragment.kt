package com.example.retrofit.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.retrofit.R
import com.example.retrofit.onBoarding.screens.FirstScreen
import com.example.retrofit.onBoarding.screens.SecondScreen
import com.example.retrofit.onBoarding.screens.ThirdScreen


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        val fragmentList= arrayListOf <Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen(),
        )
        val adapter=ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = adapter


        return view
    }
}