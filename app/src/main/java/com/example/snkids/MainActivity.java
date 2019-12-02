package com.example.snkids;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    int click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SoundPool sp = new SoundPool(1,
                AudioManager.STREAM_MUSIC,
                 0);
        click = sp.load(this, R.raw.select, 1);

        ImageButton btn_myConstellation = findViewById(R.id.btn_myConstellation);
        btn_myConstellation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(click, 1, 1, 0, 0, 1);
                Intent myConstellationIntent = new Intent(getApplicationContext(), myConstellationActivity.class);
                startActivity(myConstellationIntent);
            }
        });

        ImageButton btn_ConstellationStory = findViewById(R.id.btn_ConstellationStory);
        btn_ConstellationStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ConstellationStoryIntent = new Intent(getApplicationContext(), ConstellationStoryActivity.class);
                startActivity(ConstellationStoryIntent);
            }
        });

        ImageButton btn_Quiz = findViewById(R.id.btn_Quiz);
        btn_Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent QuizIntent = new Intent(getApplicationContext(), QuizmainActivity.class);
                startActivity(QuizIntent);
            }
        });

        ImageButton btn_GalaxiesStory = findViewById(R.id.btn_GalaxiesStory);
        btn_GalaxiesStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GalaxiesStoryIntent = new Intent(getApplicationContext(), GalaxiesStoryActivity.class);
                startActivity(GalaxiesStoryIntent);
            }
        });



    }
}
