package com.example.snkids;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class GalaxiesStoryActivity extends Activity {

    int click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxiesstory);

        final SoundPool sp = new SoundPool(1,
                AudioManager.STREAM_MUSIC,
                0);
        click = sp.load(this, R.raw.select, 1);

        ImageView img_sun = findViewById(R.id.img_sun);
        img_sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "난 안할 태양", Toast.LENGTH_SHORT).show();

                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxySunActivity.class);
                startActivity(Intent);
            }
        });

        ImageView img_mercury = findViewById(R.id.img_mercury);
        img_mercury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "수성수성", Toast.LENGTH_SHORT).show();

                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxyMerActivity.class);
                startActivity(Intent);
            }
        });

        ImageView img_venus = findViewById(R.id.img_venus);
        img_venus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "금성금성", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxyVenActivity.class);
                startActivity(Intent);
            }
        });

        ImageView img_earth = findViewById(R.id.img_earth);
        img_earth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "지구지구", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxyEarActivity.class);
                startActivity(Intent);
            }
        });

        ImageView img_mars = findViewById(R.id.img_mars);
        img_mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "화성화성", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxyMarActivity.class);
                startActivity(Intent);
            }
        });

        ImageView img_jupiter = findViewById(R.id.img_jupiter);
        img_jupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "태양아 그러면 목성", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxyJupActivity.class);
                startActivity(Intent);
            }
        });

        ImageView img_saturn = findViewById(R.id.img_saturn);
        img_saturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "토성토성", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxySatActivity.class);
                startActivity(Intent);
            }
        });

        ImageView img_uranus = findViewById(R.id.img_uranus);
        img_uranus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "천왕성왕성", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxyUraActivity.class);
                startActivity(Intent);
            }
        });

        ImageView img_neptune = findViewById(R.id.img_neptune);
        img_neptune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GalaxiesStoryActivity.this, "너 숙제 해왕성?", Toast.LENGTH_SHORT).show();
                sp.play(click, 1, 1, 0, 0, 1);
                Intent Intent = new Intent(getApplicationContext(), GalaxyNepActivity.class);
                startActivity(Intent);
            }
        });
    }
}
