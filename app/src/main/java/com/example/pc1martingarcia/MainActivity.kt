package com.example.pc1martingarcia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var porpar:Double =0.2;
    var porfin:Double =0.2;
    var porpep:Double =0.6;


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        val edparcial:EditText = findViewById(R.id.edtparcial)
        val estfinal:EditText = findViewById(R.id.estfinal)
        val edtpep:EditText = findViewById(R.id.edtpep)
        var edparcialv = edparcial.text.toString().toDoubleOrNull() ?:0.0;
        var estfinalv = estfinal.text.toString().toDoubleOrNull() ?:0.0;
        var edtpepv = edtpep.text.toString().toDoubleOrNull() ?:0.0;
        var res = porpar * edparcialv+ porfin*estfinalv+porpep*edtpepv;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (res>=10.5){
            print(getString(R.string.aprobado))
        }else{
            print(getString(R.string.desaprobado))
        }

    }

}