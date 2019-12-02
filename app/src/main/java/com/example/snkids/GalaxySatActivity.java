package com.example.snkids;


import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class GalaxySatActivity extends Activity {

    int back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxysat);
        final SoundPool sp = new SoundPool(1,
                AudioManager.STREAM_MUSIC,
                0);
        back = sp.load(this, R.raw.back, 1);
        ImageButton btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sp.play(back, 1, 1, 0, 0, 1);
                finish();
            }
        });
    }


}