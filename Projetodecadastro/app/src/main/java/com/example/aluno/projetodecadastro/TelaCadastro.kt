package com.example.aluno.projetodecadastro

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.WindowId
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_tela_cadastro.*
import org.jetbrains.anko.*

class Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



       /* lateinit var edId:TextView
        lateinit var edNome: TextView
        lateinit var edEmail: TextView
        lateinit var edPass: TextView
        var btnlistar:TextView

        var edCreated:TextView

        verticalLayout {
            padding = dip(100)
            background = ColorDrawable(Color.parseColor("#F8F2F2"))

            edId = editText{
                hint = "id Hint"
                textSize =24f
                textColor =Color.GREEN
                textAlignment = View.TEXT_ALIGNMENT_CENTER

            }

            edNome = editText{
                hint = "Nome Hint"
                textSize = 24f
                textAlignment = View.TEXT_ALIGNMENT_GRAVITY
            }
            edEmail = editText{
                hint="email"
                textSize=24f
            }
            edPass =editText{
                hint = "Pass"
                textSize =24f
            }
            edCreated =editText{
                hint = "Email hint"
                textSize =24f
            }

            var button:Button = button("Listar") {
                setOnClickListener(View.OnClickListener {
                    toast("Botão listar clicando")
                    var u: Usuario = Usuario(
                            edNome.text.toString(),
                            edEmail.text.toString(),
                            edPass.text.toString(),
                            edPass.text, toString()
                    )
                    UsuarioReppository(getApplicationContext()).create(u)
                })
                var buttonList: Button=button ("Listar") {
                    setOnClickListener(View.OnClickListener {
                        toast("botao listar clicado")
                    })
                }
                }


            }

        }

*/






        setContentView(R.layout.activity_tela_cadastro)

        val btLogin: Button = findViewById(R.id.buttoincluir)


        btLogin.setOnClickListener(View.OnClickListener {
            val textViewName: TextView = findViewById<TextView>(R.id.nome) as TextView
            val textViewEmail: TextView = findViewById<TextView>(R.id.nome) as TextView
            val textViewLogin: TextView = findViewById<TextView>(R.id.login) as TextView
            val textViewSenha: TextView = findViewById<TextView>(R.id.senha) as TextView

            val loginResult: Boolean = AppStaticServices.login(

                    textViewName.text.toString(),
                    textViewEmail.text.toString(),
                    textViewLogin.text.toString(),
                    textViewSenha.text.toString())



        })
    }
}