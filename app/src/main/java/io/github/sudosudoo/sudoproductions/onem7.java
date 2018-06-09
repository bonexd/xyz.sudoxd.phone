package io.github.sudosudoo.sudoproductions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class onem7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onem7);
    }
    public void onem7rom(View v) {
        startActivity(new Intent(this, onem7rom.class));
    }
}
