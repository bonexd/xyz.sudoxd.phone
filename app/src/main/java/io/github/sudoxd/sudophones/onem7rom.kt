package io.github.sudoxd.sudophones

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import xyz.sudoxd.phone.R

class onem7rom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onem7rom)
    }

    fun onem7lollipop(v: View) {
        startActivity(Intent(this, onem7romll::class.java))
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun onem7mm(v: View) {
        startActivity(Intent(this, onem7rommm::class.java))
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun onem7nougat(v: View) {
        startActivity(Intent(this, onem7romnougat::class.java))
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun onem7oreo(v: View) {
        startActivity(Intent(this, onem7romoreo::class.java))
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }
}
