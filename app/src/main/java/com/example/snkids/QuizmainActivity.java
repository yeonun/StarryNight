package com.example.snkids;


import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class QuizmainActivity extends Activity {
    public static String jsonFile = "001_001.json";
    int back;
    int click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmain);
        final SoundPool sp = new SoundPool(1,
                AudioManager.STREAM_MUSIC,
                0);
        back = sp.load(this, R.raw.back, 1);
        click = sp.load(this, R.raw.select,1);
        ImageButton btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(back, 1, 1, 0, 0, 1);
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