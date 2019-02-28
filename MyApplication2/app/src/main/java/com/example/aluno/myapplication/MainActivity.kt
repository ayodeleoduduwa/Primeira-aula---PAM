package com.example.aluno.myapplication

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin : Button = findViewById<Button>(R.id.btLogin)

        btLogin.setOnClickListener(View.OnClickListener {
            val textViewLogin: TextView = findViewById<TextView>(R.id.etUserName) as TextView
            val textViewSenha: TextView = findViewById<TextView>(R.id.epSenha) as TextView

            //val LoginResult : Boolean = AppStaticServices.login(
           // textViewLogin.text.toString(),
           // textViewSenha..toString())
        /*if LoginResult == true) {
            toast("Login realizado com sucesso")
        }
            else{
            toast("Usuario ou senha incorreto")
        }*/



        }}


