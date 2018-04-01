package com.example.devit.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class FirstQuestionActivity extends AppCompatActivity {
    MainActivity ScoreCountUpdate = new MainActivity();
    int ScoreAddCount = ScoreCountUpdate.SoreCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
    }

    public void nextBtn1(View view) {
        Toast CorrectToast = Toast.makeText(getApplicationContext(), "Correct ! ", Toast.LENGTH_SHORT);
        Toast FalseToast = Toast.makeText(getApplicationContext(), "Wrong answer !", Toast.LENGTH_SHORT);

        RadioButton answerQuestionOne = (RadioButton) findViewById(R.id.CorrectAnswerOne);
      boolean answerOFQuestionOne = answerQuestionOne.isChecked();


        if (answerOFQuestionOne) {
            CorrectToast.show();
            ScoreAddCount = ScoreAddCount + 1;
        } else {
            FalseToast.show();
        }


        Intent intent = new Intent(this, SecondQuestionActivity.class);
        startActivity(intent);
        finish();

    }


    public void backBtn1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }


}
