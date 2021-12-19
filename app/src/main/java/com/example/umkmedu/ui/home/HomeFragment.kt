package com.example.umkmedu.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.umkmedu.R
import com.example.umkmedu.ReadArtikel
import com.example.umkmedu.WriteDiscuss
import com.example.umkmedu.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false);
        val headline: CardView = rootView.findViewById(R.id.headline) as CardView;
        headline.setOnClickListener {
            val intent = Intent(getActivity(), ReadArtikel::class.java)
            // start your next activity
            startActivity(intent)
        }
        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}