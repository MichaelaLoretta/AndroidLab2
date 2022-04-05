package com.loretta.android_studio_lab_2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class NavActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav)

        var userEmail : String = intent.getStringExtra("userEmail").toString()


      /*  NÄR JAG AKTIVERAR KODEN NEDAN FÖR ATT FÅ IGÅNG MIN NAVIGATION SÅ ÅTERGÅR APPEN TILL MAIN ACTIVITY ELLER KRASHAR,
      HITTAR EJ LÖSNING. felbeskrivning är denna "NavActivity@871edbc does not have a NavController set on 2131231226" har googlat men får det
      ej att fungera

       val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragment)

        bottomNavigationView.setupWithNavController(navController)*/

        Toast.makeText(this, "your email address is $userEmail", Toast.LENGTH_SHORT).show()



    }
}