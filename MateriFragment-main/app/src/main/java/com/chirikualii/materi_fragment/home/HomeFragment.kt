package com.chirikualii.materi_fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chirikualii.materi_fragment.R
import com.chirikualii.materi_fragment.databinding.FragmentHomeBinding
import com.chirikualii.materi_fragment.home.nowplaying.NowplayingFragment
import com.chirikualii.materi_fragment.home.popular.PopularFragment


class HomeFragment : Fragment() {

private lateinit var binding: FragmentHomeBinding
private val listFragment = listOf(
    NowplayingFragment(),
    PopularFragment()
)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(
            inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPagerAdapter = ViewPagerAdapter(
            listFragment,parentFragmentManager
        )

        binding.viewPager.adapter = viewPagerAdapter

        binding.tablayout.setupWithViewPager(binding.viewPager)
    }
}