package com.example.traficklight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void red(View view){
        LinearLayout linearLayout = findViewById(R.id.cont);
        linearLayout.setBackgroundResource(R.drawable.red);
    }

    public void yellow(View view){
        LinearLayout linearLayout = findViewById(R.id.cont);
        linearLayout.setBackgroundResource(R.drawable.yellow);
    }

    public void green(View view){
        LinearLayout linearLayout = findViewById(R.id.cont);
        linearLayout.setBackgroundResource(R.drawable.green);
    }
}
