package com.example.umkmedu.ui.artikel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.umkmedu.R

internal class GridAdapter(
    private val context: Context,
    private val manhwaname: Array<String>,
    private val image: IntArray,
    private val genre: Array<String>

) :
//class GridAdapter(
////    var context: Context,
////    var manhwaname: Array<String>,
////    var image: IntArray,
////    var genre: Array<String>
////) :

    BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var textView1: TextView
    override fun getCount(): Int {
        return manhwaname.size
    }
    override fun getItem(position: Int): Any? {
        return null
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View? {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.gridartikel, null)
        }
        imageView = convertView!!.findViewById<ImageView>(R.id.grid_image)
        textView = convertView.findViewById<TextView>(R.id.item_name)
        textView1 = convertView.findViewById<TextView>(R.id.item_genre)
        imageView.setImageResource(image[position])
        textView.text = manhwaname[position]
        textView1.text = genre[position]
        return convertView
    }

}
//    BaseAdapter() {
//    var inflater: LayoutInflater? = null
//    override fun getCount(): Int {
//        return manhwaname.size
//    }
//
//    override fun getItem(position: Int): Any {
//        return null
//    }
//
//    override fun getItemId(position: Int): Long {
//        return 0
//    }
//
//    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
//        var convertView = convertView
//        if (inflater == null) inflater =
//            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        if (convertView == null) {
//            convertView = inflater.inflate(R.layout.grid_item, null)
//        }
//        val imageView = convertView.findViewById<ImageView>(R.id.grid_image)
//        val textView = convertView.findViewById<TextView>(R.id.item_name)
//        val textView1 = convertView.findViewById<TextView>(R.id.item_genre)
//        imageView.setImageResource(image[position])
//        textView.text = manhwaname[position]
//        textView1.text = genre[position]
//        return convertView
//    }
