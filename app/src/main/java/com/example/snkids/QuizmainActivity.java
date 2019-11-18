package com.example.snkids;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class QuizmainActivity extends Activity {
    public static String jsonFile = "001_001.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmain);

        ImageButton btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void constellationquizbtnClicked(View v) {
        QuizmainActivity.jsonFile = "001_001.json";
        Intent intent = new Intent(getApplicationContext(), GameActivity.class);
        startActivity(intent);
    }

    public void galaxiesquizbtnClicked(View v) {
        QuizmainActivity.jsonFile = "001_002.json";
        Intent intent = new Intent(getApplicationContext(), GameActivity.class);
        startActivity(intent);
    }

    public void earthquizbtnClicked(View v) {
        QuizmainActivity.jsonFile = "001_003.json";
        Intent intent = new Intent(getApplicationContext(), GameActivity.class);
        startActivity(intent);
    }
}