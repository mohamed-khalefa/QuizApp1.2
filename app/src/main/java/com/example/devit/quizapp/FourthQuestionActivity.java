package com.example.devit.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class FourthQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);
    }

    public void nextBtn4(View view) {
        Toast CorrectToast = Toast.makeText(getApplicationContext(), "Correct ! ", Toast.LENGTH_SHORT);
        Toast FalseToast = Toast.makeText(getApplicationContext(), "Wrong answer !", Toast.LENGTH_SHORT);

        RadioButton answerQuestionFour = (RadioButton) findViewById(R.id.CorrectAnswerFour);
        boolean answerOFQuestionFour = answerQuestionFour.isChecked();


        if (answerOFQuestionFour) {
            CorrectToast.show();
        } else {
            FalseToast.show();
        }

        Intent intent = new Intent(this, Fifth.class);
        startActivity(intent);
        finish();
    }

    public void backBtn4(View view) {
        Intent intent = new Intent(this, ThirdQuestionActivity.class);
        startActivity(intent);
        finish();
    }
}
