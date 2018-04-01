package com.example.devit.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Fifth extends AppCompatActivity {

    int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void submitBTN(View view) {


        Toast CorrectToast = Toast.makeText(getApplicationContext(), "Correct ! ", Toast.LENGTH_SHORT);
        Toast FalseToast = Toast.makeText(getApplicationContext(), "Wrong answer !", Toast.LENGTH_SHORT);

        RadioButton answerQuestionFive = (RadioButton) findViewById(R.id.CorrectAnswerFive);
        boolean answerOFQuestionFive = answerQuestionFive.isChecked();


        if (answerOFQuestionFive) {
            CorrectToast.show();

        } else {
            FalseToast.show();
        }

        Intent intent = new Intent(this, Fifth.class);
        startActivity(intent);
        finish();

    }

    public void backBtn5(View view) {
        Intent intent = new Intent(this, FourthQuestionActivity.class);
        startActivity(intent);
        finish();
    }


}
