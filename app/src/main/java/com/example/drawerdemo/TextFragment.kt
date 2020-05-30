package com.example.drawerdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.content_layout.*

/**
 * A simple [Fragment] subclass.
 */
class TextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        requireActivity().collapsingToolBarLayout.title = getString(R.string.text_fragment_title)
        requireActivity().toolbarIconImageView.setImageResource(R.drawable.ic_looks_one)
        return inflater.inflate(R.layout.fragment_text, container, false)
    }

}
