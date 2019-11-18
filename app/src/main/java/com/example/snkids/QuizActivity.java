package com.example.snkids;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class QuizActivity extends Activity {


    TextView questionTextView;
    Button example1Button;
    Button example2Button;
    Button example3Button;
    Button example4Button;
    //
    HashMap[] problems = {
            new HashMap() {{
                put("question", "1 + 2 = ?");
                put("answer", "3");
                put("example1", "1");
                put("example2", "3");
                put("example3", "2");
                put("example4", "4");
            }},
            new HashMap() {{
                put("question", "3 + 2 = ?");
                put("answer", "5");
                put("example1", "4");
                put("example2", "6");
                put("example3", "5");
                put("example4", "2");
            }},
            new HashMap() {{
                put("question", "3 + 3 = ?");
                put("answer", "6");
                put("example1", "6");
                put("example2", "1");
                put("example3", "5");
                put("example4", "4");
            }},
            new HashMap() {{
                put("question", "0 + 3 = ?");
                put("answer", "3");
                put("example1", "1");
                put("example2", "2");
                put("example3", "4");
                put("example4", "3");
            }},
            new HashMap() {{
                put("question", "4 + 2 = ?");
                put("answer", "6");
                put("example1", "6");
                put("example2", "4");
                put("example3", "2");
                put("example4", "5");
            }},
            new HashMap() {{
                put("question", "5 + 4 = ?");
                put("answer", "9");
                put("example1", "8");
                put("example2", "6");
                put("example3", "7");
                put("example4", "9");
            }},
            new HashMap() {{
                put("question", "4 + 4 = ?");
                put("answer", "8");
                put("example1", "7");
                put("example2", "1");
                put("example3", "8");
                put("example4", "3");
            }},
            new HashMap() {{
                put("question", "2 + 5 = ?");
                put("answer", "7");
                put("example1", "7");
                put("example2", "1");
                put("example3", "5");
                put("example4", "4");
            }},
            new HashMap() {{
                put("question", "1 + 4 = ?");
                put("answer", "5");
                put("example1", "4");
                put("example2", "5");
                put("example3", "0");
                put("example4", "6");
            }},
            new HashMap() {{
                put("question", "3 + 1 = ?");
                put("answer", "4");
                put("example1", "8");
                put("example2", "3");
                put("example3", "4");
                put("example4", "0");
            }}
    };
    int problemNumber = 1;
    String question = "";
    String answer = "";
    String example1 = "";
    String example2 = "";
    String example3 = "";
    String example4 = "";

    int totalCorrect = 0;
    Button totalCorrectTextView;
    ImageView correctImgView;
    ImageView IncorrectImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ImageButton btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        questionTextView = findViewById(R.id.questionTextView);
        example1Button = findViewById(R.id.example1Button);
        example2Button = findViewById(R.id.example2Button);
        example3Button = findViewById(R.id.example3Button);
        example4Button = findViewById(R.id.example4Button);

        totalCorrectTextView = findViewById(R.id.totalCorrectTextView);
        correctImgView = findViewById(R.id.correctImgView);
        IncorrectImgView = findViewById(R.id.IncorrectImgView);

        showProblem();

        totalCorrectTextView.setText("점수");
        correctImgView.setVisibility(View.INVISIBLE);
        IncorrectImgView.setVisibility(View.INVISIBLE);
    }
    void showProblem() {
        question = (String)problems[problemNumber - 1].get("question");
        answer = (String)problems[problemNumber - 1].get("answer");
        example1 = (String)problems[problemNumber - 1].get("example1");
        example2 = (String)problems[problemNumber - 1].get("example2");
        example3 = (String)problems[problemNumber - 1].get("example3");
        example4 = (String)problems[problemNumber - 1].get("example4");

        questionTextView.setText(question);
        example1Button.setText(example1);
        example2Button.setText(example2);
        example3Button.setText(example3);
        example4Button.setText(example4);
    }
    public void example1ButtonClicked(View v) {
        Log.d("app", "example1ButtonClicked");
        selectExample(example1);
    }

    void selectExample(String example) {
        Log.d("app", example);
        if (answer.equals(example)) {
            totalCorrect += 1;
            totalCorrectTextView.setText(Integer.toString(totalCorrect)+"점");
            correctImgView.setVisibility(View.VISIBLE);
            IncorrectImgView.setVisibility(View.INVISIBLE);
        }
        else {
            correctImgView.setVisibility(View.INVISIBLE);
            IncorrectImgView.setVisibility(View.VISIBLE);
        }

        example1Button.setEnabled(false);
        example2Button.setEnabled(false);
        example3Button.setEnabled(false);
        example4Button.setEnabled(false);
        Handler h = new Handler() ;
        h.postDelayed(new Runnable() {
            public void run() {
                example1Button.setEnabled(true);
                example2Button.setEnabled(true);
                example3Button.setEnabled(true);
                example4Button.setEnabled(true);

                if (problemNumber < problems.length) {
                    problemNumber += 1;
                    showProblem();
                    correctImgView.setVisibility(View.INVISIBLE);
                    IncorrectImgView.setVisibility(View.INVISIBLE);
                }
                else {
                    Log.d("app", "showGameOverBox");
                    showGameOverBox();
                }
            }}, 1000);
    }

    void showGameOverBox() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("퀴즈 끝!"+"  "+totalCorrect+"점");
        alertDialogBuilder
                //.setMessage("")
                .setPositiveButton("다시하기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        replay();
                    }
                })
                .setNegativeButton("다른 문제 풀기!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        exitApp();
                    }
                })
                .setCancelable(false); //true by default

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    void replay() {
        problemNumber = 1;
        totalCorrect = 0;
        //
        showProblem();
        //
        totalCorrectTextView.setText("점수");
        correctImgView.setVisibility(View.INVISIBLE);
        IncorrectImgView.setVisibility(View.INVISIBLE);
    }

    void exitApp() {
        finish();
    }

    public void example2ButtonClicked(View v) {
        Log.d("app", "example2ButtonClicked");
        selectExample(example2);
    }

    public void example3ButtonClicked(View v) {
        Log.d("app", "example3ButtonClicked");
        selectExample(example3);
    }

    public void example4ButtonClicked(View v) {
        Log.d("app", "example4ButtonClicked");
        selectExample(example4);
    }

}