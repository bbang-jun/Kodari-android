package com.bit.kodari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bit.kodari.databinding.FragmentPossessionCoinMemoDialogBinding
import com.bit.kodari.databinding.FragmentPossessionCoinSearchBinding

class PossessionCoinSearchFragment : Fragment() {
    lateinit var binding:FragmentPossessionCoinSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPossessionCoinSearchBinding.inflate(inflater , container , false)

        return binding.root
    }
}