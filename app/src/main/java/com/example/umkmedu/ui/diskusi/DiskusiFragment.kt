package com.example.umkmedu.ui.diskusi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import com.example.umkmedu.databinding.FragmentDiskusiBinding

class DiskusiFragment : Fragment() {

    private lateinit var DiskusiViewModel: DiskusiViewModel
    private var _binding: FragmentDiskusiBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        DiskusiViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                DiskusiViewModel::class.java
            )

        _binding = FragmentDiskusiBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDiskusi
        DiskusiViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}