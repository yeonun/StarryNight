package com.example.snkids;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ConstellationStoryActivity extends Activity {

    int back;
    int click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constellationstory);
        final SoundPool sp = new SoundPool(1,
                AudioManager.STREAM_MUSIC,
                0);
        back = sp.load(this, R.raw.back, 1);
        click = sp.load(this, R.raw.select, 1);

        ImageButton btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(back, 1, 1, 0, 0, 1);
                finish();
            }
        });

        ImageButton btn_sagittarius  = findViewById(R.id.btn_sagittarius);
        btn_sagittarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "궁수자리", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), sagittariusActivity.class);
                startActivity(Intent);
            }
        });

        ImageButton btn_capricorn  = findViewById(R.id.btn_capricorn);
        btn_capricorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "염소자리", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), capricornActivity.class);
                startActivity(Intent);
            }
        });

        ImageButton btn_aquarius = findViewById(R.id.btn_aquarius);
        btn_aquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "물병자리", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), aquariusActivity.class);
                startActivity(Intent);

            }
        });

        ImageButton btn_pisces = findViewById(R.id.btn_pisces);
        btn_pisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "물고기자리", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btn_aries = findViewById(R.id.btn_aries);
        btn_aries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "양자리", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btn_taurus = findViewById(R.id.btn_taurus);
        btn_taurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "황소자리", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btn_gemini = findViewById(R.id.btn_gemini);
        btn_gemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "쌍둥이자리", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btn_cancer = findViewById(R.id.btn_cancer);
        btn_cancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "게자리", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btn_leo = findViewById(R.id.btn_leo);
        btn_leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "사자자리", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btn_virgo = findViewById(R.id.btn_virgo);
        btn_virgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "처녀자리", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton btn_libra = findViewById(R.id.btn_libra);
        btn_libra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "천칭자리", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton btn_scorpio = findViewById(R.id.btn_scorpio);
        btn_scorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConstellationStoryActivity.this, "전갈자리", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
