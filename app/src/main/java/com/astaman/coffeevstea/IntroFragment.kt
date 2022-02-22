package com.astaman.coffeevstea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.astaman.coffeevstea.databinding.FragmentIntroBinding
import androidx.navigation.Navigation

class IntroFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_intro, container, false)
        val binding: FragmentIntroBinding = DataBindingUtil.inflate (
                                    inflater, R.layout.fragment_intro, container, false)

        binding.startBtn.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_quizFragment)
        )
        return binding.root
    }






}