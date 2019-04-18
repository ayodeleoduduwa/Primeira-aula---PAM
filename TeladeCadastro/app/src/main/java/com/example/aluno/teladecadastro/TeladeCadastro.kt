package com.example.aluno.teladecadastro

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_telade_cadastro.*

class TeladeCadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telade_cadastro)
       // setSupportActionBar(toolbar)

        /*fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }*/

        val arraypam = ArrayList<String>()
        arraypam.add("Linha1")
        arraypam.add("Linha2")
        arraypam.add("Linha3")
        arraypam.add("Linha4")

        val lv: ListView = findViewById(R.id.minhaprimeiralistview)

        lv.adapter = ArrayAdapter(
                 this,
        android.R.layout.simple_list_item_1,
        arraypam)

    }



    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main_list_view, menu)
        return true
    }
    override fun onOptionItemSelected(item: MenuItem): Boolean {

    }*/

}
