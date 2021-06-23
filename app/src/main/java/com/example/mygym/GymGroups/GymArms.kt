package com.example.mygym.GymGroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.mygym.R

class GymArms : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var prvi: CardView
    private lateinit var drugi: CardView
    private lateinit var treci: CardView
    private lateinit var cetvrti: CardView
    private lateinit var peti: CardView
    private lateinit var sesti: CardView
    private lateinit var sedmi: CardView
    private lateinit var osmi: CardView
    private lateinit var deveti: CardView
    private lateinit var deseti: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gym_arms)

        text = findViewById(R.id.glavni_tekst)
        prvi = findViewById(R.id.prvi)
        drugi = findViewById(R.id.drugi)
        treci = findViewById(R.id.treci)
        cetvrti = findViewById(R.id.cetvrti)
        peti = findViewById(R.id.peti)
        sesti = findViewById(R.id.sesti)
        sedmi = findViewById(R.id.sedmi)
        osmi = findViewById(R.id.osmi)
        deveti = findViewById(R.id.deveti)
        deseti = findViewById(R.id.deseti)

    }
}
