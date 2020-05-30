package com.example.drawerdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.content_layout.*
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        requireActivity().collapsingToolBarLayout.title = getString(R.string.list_fragment_title)
        requireActivity().toolbarIconImageView.setImageResource(R.drawable.ic_looks_two)
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = GridLayoutManager(requireContext(), 2)
        val adapter = MyListAdapter(false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        adapter.submitList(iconsList())

    }
}

fun iconsList(): List<Int> {
    val array = intArrayOf(
        R.drawable.ic_1,
        R.drawable.ic_2,
        R.drawable.ic_3,
        R.drawable.ic_4,
        R.drawable.ic_5,
        R.drawable.ic_6,
        R.drawable.ic_7,
        R.drawable.ic_8,
        R.drawable.ic_9
    )
    return Array(50) {
        array.random()
    }.toList()
}
