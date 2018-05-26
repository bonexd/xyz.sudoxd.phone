package io.github.sudosudoo.sudoproductions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rom);
    }

    public void onem7(View v) {
        startActivity(new Intent(this, onem7.class));
    }
}
