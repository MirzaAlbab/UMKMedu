package com.example.umkmedu.ui.artikel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.umkmedu.R

class GridAdapter {
    var context: Context? = null
    lateinit var manhwaname: Array<String>
    lateinit var genre: Array<String>
    lateinit var image: IntArray

    var inflater: LayoutInflater? = null

    fun GridAdapter(
        context: Context?,
        manhwaname: Array<String>,
        image: IntArray,
        genre: Array<String>
    ) {
        this.context = context
        this.manhwaname = manhwaname
        this.image = image
        this.genre = genre
    }

    fun getCount(): Int {
        return manhwaname.size
    }

    fun getItem(position: Int): Any? {
        return null
    }

    fun getItemId(position: Int): Long {
        return 0
    }

    fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView = convertView
        if (inflater == null) inflater =
            context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        if (convertView == null) {
            convertView = inflater!!.inflate(R.layout.grid_item, null)
        }
        val imageView = convertView!!.findViewById<ImageView>(R.id.grid_image)
        val textView = convertView.findViewById<TextView>(R.id.item_name)
        val textView1 = convertView.findViewById<TextView>(R.id.item_genre)
        imageView.setImageResource(image[position])
        textView.text = manhwaname[position]
        textView1.text = genre[position]
        return convertView
    }

}