package com.itigradteamsix.snapshop.shoppingcart.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.itigradteamsix.snapshop.R
import com.itigradteamsix.snapshop.databinding.FragmentShoppingCartBinding


class ShoppingCartFragment : Fragment() {

lateinit var binding: FragmentShoppingCartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentShoppingCartBinding.inflate(inflater,container,false)
        return binding.root}


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}