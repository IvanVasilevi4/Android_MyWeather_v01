package com.ivanvasilevich.myweather_01;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickBackground(View view) {
        Switch s1 = findViewById(R.id.switch1);
        if (s1.isChecked()) {
            LinearLayout ll = (LinearLayout) findViewById(R.id.mainLayout);
            ll.setBackgroundColor(getResources().getColor(R.color.colorDarkBlue));
        } else {
            LinearLayout ll = (LinearLayout) findViewById(R.id.mainLayout);
            ll.setBackgroundColor(getResources().getColor(R.color.colorLightBlue));
        }
    }
}
