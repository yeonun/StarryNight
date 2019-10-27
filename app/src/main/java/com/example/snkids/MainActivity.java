package com.example.snkids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn_myConstellation = (ImageButton) findViewById(R.id.btn_myConstellation);
        btn_myConstellation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myConstellationIntent = new Intent(getApplicationContext(), myConstellationActivity.class);
                startActivity(myConstellationIntent);
            }
        });

    }
}
