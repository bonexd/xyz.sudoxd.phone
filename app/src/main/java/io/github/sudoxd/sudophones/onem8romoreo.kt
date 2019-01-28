package io.github.sudoxd.sudophones

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import xyz.sudoxd.phone.R

class onem8romoreo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onem8romoreo)
    }

    private fun goToUrl(url: String) {
        val uriUrl = Uri.parse(url)
        val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
        startActivity(launchBrowser)
    }

    fun gotoonem8oreorr(view: View) {
        goToUrl("https://forum.xda-developers.com/htc-one-m8/development/rom-resurrection-remix-t3747355")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun gotoonem8oreocrdroid(view: View) {
        goToUrl("https://forum.xda-developers.com/htc-one-m8/development/m8-m8d-romcrdroidbeta-t3749587")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun gotoonem8oreoxenonhd(view: View) {
        goToUrl("https://mirrors.c0urier.net/android/teamhorizon/O/Experimental/m8/")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun gotoonem8oreolineageos(view: View) {
        goToUrl("https://forum.xda-developers.com/htc-one-m8/development/rom-lineageos-15-0-htc-one-m8-t3669070%22")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }
}
