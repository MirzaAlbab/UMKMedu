package com.example.umkmedu.ui.artikel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.Toast
import com.example.umkmedu.databinding.FragmentArtikelBinding

class ArtikelFragment : Fragment() {

    private lateinit var ArtikelViewModel: ArtikelViewModel
    private var _binding: FragmentArtikelBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ArtikelViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(ArtikelViewModel::class.java)

        _binding = FragmentArtikelBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textArtikel
        ArtikelViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    var binding: ActivityMainBinding? = null

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.getRoot())
        val manhwaname = arrayOf("UMKM Batik", "UMKM Kerajinan", "UMKM Kuliner", "UMKM Kecantikan")
        val flowerImages = intArrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d)
        val genre = arrayOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
        )
        val ket = arrayOf(
            "Baca Selanjutnya...",
            "Baca Selanjutnya...",
            "Baca Selanjutnya...",
            "Baca Selanjutnya..."
        )
        val gridAdapter = GridAdapter(this@MainActivity, manhwaname, flowerImages, genre)
        binding.gridView.setAdapter(gridAdapter)
        binding.gridView.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this@MainActivity,
                "You Clicked on " + manhwaname[position],
                Toast.LENGTH_SHORT
            ).show()
        })
    }
}