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

class onem7romnougat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onem7romnougat)
    }

    private fun goToUrl(url: String) {
        val uriUrl = Uri.parse(url)
        val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
        startActivity(launchBrowser)
    }

    fun onem7nougatxenonhd(view: View) {
        goToUrl("https://forum.xda-developers.com/htc-one/orig-development/rom-xenonhd-5-0-2-beta1-27-12-14-t2986038")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun onem7nougataicp(view: View) {
        goToUrl("https://forum.xda-developers.com/htc-one/development/rom-aicp-12-1-n-7-1-1-official-nightly-t3537595")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun onem7nougattesla(view: View) {
        goToUrl("https://forum.xda-developers.com/htc-one/general/test-rom-t3519577")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }
}
