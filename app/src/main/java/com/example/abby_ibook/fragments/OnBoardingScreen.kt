package com.example.abby_ibook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.abby_ibook.R
import com.example.abby_ibook.databinding.FragmentOnBoardingScreenBinding

class OnBoardingScreen : Fragment() {
    private var _binding : FragmentOnBoardingScreenBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentOnBoardingScreenBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.getStarted.setOnClickListener {
            navCon.navigate(R.id.action_onBoardingScreen_to_signIn2)
        }
    }

}