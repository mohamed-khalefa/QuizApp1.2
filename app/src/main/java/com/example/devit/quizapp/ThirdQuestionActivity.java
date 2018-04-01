package com.example.devit.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ThirdQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
    }

    public void nextBtn3(View view) {
        Toast CorrectToast = Toast.makeText(getApplicationContext(), "Correct ! ", Toast.LENGTH_SHORT);
        Toast FalseToast = Toast.makeText(getApplicationContext(), "Wrong answer !", Toast.LENGTH_SHORT);

        RadioButton answerQuestionThree = (RadioButton) findViewById(R.id.CorrectAnswerThree);
        boolean answerOFQuestionThree = answerQuestionThree.isChecked();


        if (answerOFQuestionThree) {
            CorrectToast.show();
        } else {
            FalseToast.show();
        }


        Intent intent = new Intent(this, FourthQuestionActivity.class);
        startActivity(intent);
        finish();
    }

    public void backBtn3(View view) {
        Intent intent = new Intent(this, SecondQuestionActivity.class);
        startActivity(intent);
        finish();
    }
}
