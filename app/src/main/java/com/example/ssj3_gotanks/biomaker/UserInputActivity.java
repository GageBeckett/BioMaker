package com.example.ssj3_gotanks.biomaker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class UserInputActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
    }
    public void onBioSend(View view){
        EditText firstName = (EditText)findViewById(R.id.firstName);
        EditText lastName = (EditText)findViewById(R.id.lastName);
        EditText school = (EditText)findViewById(R.id.school);
        Spinner year = (Spinner)findViewById(R.id.graduation);
        EditText degree = (EditText)findViewById(R.id.degree);
        EditText major = (EditText)findViewById(R.id.major);
        EditText hobbies = (EditText)findViewById(R.id.hobbies);


        String first = firstName.getText().toString();
        String last = lastName.getText().toString();
        String mSchool = school.getText().toString();
        String mYear = year.getSelectedItem().toString();
        String mDegree = degree.getText().toString();
        String mMajor = major.getText().toString();
        String mHobby = hobbies.getText().toString();

        String message = first+" "+last+" holds a "+mDegree+" from "+mSchool+" as of "+mYear+" in "+mMajor+" and there hobbies are "+mHobby;
        Intent intent = new Intent(this, BioDisplayActivity.class);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(intent);
    }
    public void onTextSend(View view){
        EditText firstName = (EditText)findViewById(R.id.firstName);
        EditText lastName = (EditText)findViewById(R.id.lastName);
        EditText school = (EditText)findViewById(R.id.school);
        Spinner year = (Spinner)findViewById(R.id.graduation);
        EditText degree = (EditText)findViewById(R.id.degree);
        EditText major = (EditText)findViewById(R.id.major);
        EditText hobbies = (EditText)findViewById(R.id.hobbies);


        String first = firstName.getText().toString();
        String last = lastName.getText().toString();
        String mSchool = school.getText().toString();
        String mYear = year.getSelectedItem().toString();
        String mDegree = degree.getText().toString();
        String mMajor = major.getText().toString();
        String mHobby = hobbies.getText().toString();

        String message = first+" "+last+" holds a "+mDegree+" from "+mSchool+" as of "+mYear+" in "+mMajor+" and there hobbies are "+mHobby;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(intent);

    }
}
