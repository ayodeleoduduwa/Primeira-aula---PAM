package com.example.aluno.firebase

import android.os.Bundle
import android.app.Activity
import android.support.v7 .app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase..auth.Firebase
import com.google.firebase..auth.FirebaseUser


import kotlinx.android.synthetic.main.activity_firebase.*

class Firebase : Activity() {


 lateinit var btSign: Button
 lateinit var btLogin:Button
 lateinit var lbEmailDoUsuario: TextView
 lateinit var fbAuth: Firebase
 lateinit var txtEmail: EditText
 lateinit var txtPass: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firebase)

        this.lbEmailDoUsuario = findViewById<TextView>(R.id.lbEmailDoUsuario);



    }

}
