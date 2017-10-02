package com.example.ssj3_gotanks.biomaker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class BioDisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_display);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(intent.EXTRA_TEXT);
        TextView messageView = (TextView)findViewById(R.id.display);
        messageView.setText(messageText);
    }


}
