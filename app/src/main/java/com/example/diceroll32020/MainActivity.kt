package com.example.diceroll32020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RollButton:Button=findViewById(R.id.roll_button)
       // RollButton.setOnClickListener{Toast.makeText(this,"button pressed",Toast.LENGTH_SHORT)}
        RollButton.setOnClickListener {
            RollDice()
        }
        val adView = AdView(this)
        adView.adSize = AdSize.BANNER
        adView.adUnitId = "ca-app-pub-3940256099942544~3347511713"
        diceImage=findViewById(R.id.image_source)

        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            MobileAds.initialize(this) {}
            mAdView = findViewById(R.id.adView)
            val adRequest = AdRequest.Builder().build()
            mAdView.loadAd(adRequest)
        }

    }

    private fun RollDice() {
       // val result:TextView=findViewById(R.id.show_result)
        val Randomno= java.util.Random().nextInt(6) +1
        //result.text=Randomno.toString()
       // val Diceimage:ImageView=findViewById(R.id.image_source)
        val drawableres=when(Randomno)  {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableres)
    }


}
