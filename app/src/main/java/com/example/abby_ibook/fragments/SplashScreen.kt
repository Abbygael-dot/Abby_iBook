package com.example.abby_ibook.fragments

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.abby_ibook.R
import com.example.abby_ibook.databinding.FragmentSplashScreenBinding


class SplashScreen : Fragment() {

    private var _binding : FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bundle = Bundle()
        Handler().postDelayed({
            navCon.navigate(R.id.action_splashScreen_to_onBoardingScreen, bundle)
        },3000)

    }

}