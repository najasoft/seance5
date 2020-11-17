package com.example.seance5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Logger

const val CODE_REQ1=77
const val CODE_RES1=88
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.b1)
        b1.setOnClickListener {
            val intentAct2 = Intent(this, Activite2::class.java)
            val t1 = findViewById<EditText>(R.id.txt1)
            val `val` = t1.editableText.toString().toInt()
            intentAct2.putExtra("valeur", `val`)
            startActivityForResult(intentAct2, CODE_REQ1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
            if(requestCode== CODE_REQ1)
                if (resultCode== CODE_RES1) {
                    val retour = data?.getIntExtra("valeur", 0)
                    val txt1 = findViewById<EditText>(R.id.txt1)
                    txt1.setText(retour.toString())

                }
        }

}