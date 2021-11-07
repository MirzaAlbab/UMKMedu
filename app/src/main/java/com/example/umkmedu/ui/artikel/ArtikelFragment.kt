package com.example.umkmedu.ui.artikel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.umkmedu.R
import com.example.umkmedu.databinding.ActivityMainBinding
import com.example.umkmedu.databinding.FragmentArtikelBinding

class ArtikelFragment : AppCompatActivity() {

    private lateinit var ArtikelViewModel: ArtikelViewModel
    private val _binding: FragmentArtikelBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val _binding get() = _binding!!
//
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ArtikelViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(ArtikelViewModel.class)
//
        _binding = FragmentArtikelBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textArtikel
        ArtikelViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }

//    var binding: ActivityMainBinding? = null
//
//    fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(getLayoutInflater())
//        binding.setContentView(binding.getRoot())
//        val manhwaname = arrayOf("UMKM Batik", "UMKM Kerajinan", "UMKM Kuliner", "UMKM Kecantikan")
//        val flowerImages = intArrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d)
//        val genre = arrayOf(
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
//        )
//        val ket = arrayOf(
//            "Baca Selanjutnya...",
//            "Baca Selanjutnya...",
//            "Baca Selanjutnya...",
//            "Baca Selanjutnya..."
//        )
//        val gridAdapter = GridAdapter(this@MainActivity, manhwaname, flowerImages, genre)
//        binding.gridView.setAdapter(gridAdapter)
//        binding.gridView.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
//            Toast.makeText(
//                this@MainActivity,
//                "You Clicked on " + manhwaname[position],
//                Toast.LENGTH_SHORT
//            ).show()
//        })
        lateinit var gridView: GridView
        private var manhwaname = arrayOf("UMKM Batik", "UMKM Kerajinan", "UMKM Kuliner", "UMKM Kecantikan")
        private var flowerImages = intArrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d)
        private var genre = arrayOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
        )
        private var ket = arrayOf(
            "Baca Selanjutnya...",
            "Baca Selanjutnya...",
            "Baca Selanjutnya...",
            "Baca Selanjutnya..."
        )
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.gridartikel)
            title = "KotlinApp"
            gridView = findViewById(R.id.gridView)
            val GridAdapter = GridAdapter(this@ArtikelFragment, manhwaname, flowerImages, genre)
            gridView.adapter = GridAdapter
            gridView.onItemClickListener = OnItemClickListener { parent, view, position, id ->
                Toast.makeText(applicationContext, "You Clicked on " + manhwaname[position],
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
