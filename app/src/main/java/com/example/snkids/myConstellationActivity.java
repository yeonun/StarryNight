package com.example.snkids;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class myConstellationActivity extends Activity {

    int month, date;
    String string_month, string_date;
    EditText month_data, date_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myconstellation);

        ImageButton btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageButton btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                month_data = findViewById(R.id.month_data);
                date_data = findViewById(R.id.date_data);

                if ((month_data.getText().length() == 0) || (date_data.getText().length() == 0)) {
                    Toast.makeText(myConstellationActivity.this, "생일을 입력 해 주세요", Toast.LENGTH_SHORT).show();
                }
                // 입력 textfield가 비어있을 경우

                else {
                    string_month = month_data.getText().toString();
                    string_date = date_data.getText().toString();
                    month = Integer.parseInt(month_data.getText().toString());
                    date = Integer.parseInt(date_data.getText().toString());

                    if ((month == 1 && 20 <= date && date <= 31) || (month == 2 && date <= 18)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 물병자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 2 && 19 <= date && date <= 29) || (month == 3 && date <= 20)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 물고기자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 3 && 21 <= date && date <= 31) || (month == 4 && date <= 19)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 양자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 4 && 20 <= date && date <= 30) || (month == 5 && date <= 20)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 황소자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 5 && 21 <= date && date <= 31) || (month == 6 && date <= 21)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 쌍둥이자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 6 && 22 <= date && date <= 30) || (month == 7 && date <= 22)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 게자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 7 && 23 <= date && date <= 31) || (month == 8 && date <= 22)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 사자자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 8 && 23 <= date && date <= 31) || (month == 9 && date <= 22)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 처녀자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 9 && 23 <= date && date <= 30) || (month == 10 && date <= 22)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 천칭자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 10 && 23 <= date && date <= 31) || (month == 11 && date <= 22)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 전갈자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 11 && 23 <= date && date <= 30) || (month == 12 && date <= 21)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 궁수자리", Toast.LENGTH_SHORT).show();
                    } else if ((month == 12 && 22 <= date && date <= 31) || (month == 1 && date <= 19)) {
                        Toast.makeText(myConstellationActivity.this, string_month + "월 " + string_date + "일 은 염소자리", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(myConstellationActivity.this, "다시 입력 해 주세요", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }
}
