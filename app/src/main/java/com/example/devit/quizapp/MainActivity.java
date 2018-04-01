/* created by Mohamed Khalefa
*
* Quiz App
* Udacity Google ABND
*
 */
package com.example.devit.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int SoreCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * to take name , age and show toast for starting quiz
    * */
    public void personalInfo(View view) {

        /* refer to name EditText and get the string value */
        EditText Name = (EditText) findViewById(R.id.EditTextNameID);
        String nameField = Name.getText().toString();
        Log.v("MainActivity", "Name : " + nameField); // show name logs
        /* refer to age  EditText and get the string value */
        EditText Age = (EditText) findViewById(R.id.EditTextAgeID);
        String ageField = Age.getText().toString();
        Log.v("MainActivity", "Age : " + ageField); // show age logs

    }

    /*   start button to move to the first question activity and show toast msg*/
    public void startBTN(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "Great! let's Start", Toast.LENGTH_SHORT); // making toast msg
        toast.show(); // showing toast msg
        /*making intent to start  FirstQuestionActivity */
        Intent intent = new Intent(this, FirstQuestionActivity.class);
        startActivity(intent);
        finish();
    }
}
