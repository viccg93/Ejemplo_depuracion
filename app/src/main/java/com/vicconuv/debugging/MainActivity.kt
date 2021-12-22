package com.vicconuv.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloTextView: TextView = findViewById(R.id.hello_world)
        helloTextView.text = "Hello, debugging!"
        division()
        debug()
    }

    private fun division() {
        val numerator = 60
        var denominator = 5;
        repeat(6){
            if (denominator > 0){
                println("${numerator}/${denominator}= ${numerator/denominator}")
                denominator--;
            }
        }
    }

    private fun debug(){
        Log.e(TAG,"ERROR: Error serio que detiene la app")
        Log.w(TAG,"WARNING: Advertencia de posibles errores futuros")
        Log.i(TAG,"INFO: Informacion tecnica de la ejecucion")
        Log.d(TAG,"DEBUG: Informacion tecnica importante para la depuracion")
        Log.v(TAG,"VERBOSE: Informacion mas detallada que DEBUG")
    }
}