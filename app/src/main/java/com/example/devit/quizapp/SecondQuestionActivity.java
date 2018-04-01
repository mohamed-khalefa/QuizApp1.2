package com.example.devit.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class SecondQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);
    }



    public void nextBtn2(View view) {
        Toast CorrectToast = Toast.makeText(getApplicationContext(), "Correct ! ", Toast.LENGTH_SHORT);
        Toast FalseToast = Toast.makeText(getApplicationContext(), "Wrong answer !", Toast.LENGTH_SHORT);

        RadioButton answerQuestionTwo = findViewById(R.id.CorrectAnswerTwo);
        boolean answerOFQuestionTwo = answerQuestionTwo.isChecked();


        if (answerOFQuestionTwo) {
            CorrectToast.show();
        } else {
            FalseToast.show();
        }

        Intent intent = new Intent(this, ThirdQuestionActivity.class);
        startActivity(intent);
        finish();
    }
    public void backBtn2(View view) {
        Intent intent = new Intent(this, FirstQuestionActivity.class);
        startActivity(intent);
        finish();
    }
}
