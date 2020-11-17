package com.example.seance5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Logger

class Activite2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activite2)
        // Récupération du bundle reçu
        val valeur=intent.getIntExtra("valeur",0)
        val t2=findViewById<EditText>(R.id.txt2)
        t2.setText(valeur.toString())
        
        val b2=findViewById<Button>(R.id.b2)
        b2.setOnClickListener{

            val intentionRetour= Intent()
            val t2=findViewById<EditText>(R.id.txt2)
            val valeur=t2.editableText.toString().toInt()
            intentionRetour.putExtra("valeur",valeur)
            setResult(CODE_RES1,intentionRetour)
            finish()
            
        }
    }
}