package com.cj.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var listBahasa=ArrayList<Bahasa>()
    var adapter:Adapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listBahasa.add(
            Bahasa("Ruby","Ruby is an open source and fully object oriented programing language.",R.drawable.logoruby)
        )
        listBahasa.add(
            Bahasa("Rails","Ruby on Rails is a server-side web application development framework written is Ruby language.",R.drawable.rails)
        )
        listBahasa.add(
            Bahasa("Python","Python is interpreted scripting and object-oriented programming language.",R.drawable.python)
        )
        listBahasa.add(
            Bahasa("Java Script","JavaScript is an object-based scripting language.",R.drawable.javascript)
        )
        listBahasa.add(
            Bahasa("PHP","PHD is an interpreted language, Le, there is no need for compilation.",R.drawable.php)
        )
        adapter= Adapter(listBahasa,this)
        listview.adapter=adapter
    }
}
