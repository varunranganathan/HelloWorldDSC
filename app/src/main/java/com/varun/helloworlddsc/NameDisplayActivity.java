package com.varun.helloworlddsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NameDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);

        //Get the intent with which the Activity was opened
        Intent receivedIntent = getIntent();
        //Get String extra from activity using key
        String receivedName = receivedIntent.getStringExtra("name_to_be_displayed");
        //Find TextView to be used to display the name
        TextView nameTextView = (TextView) findViewById(R.id.name);
        //Set Text in TextView as Name
        nameTextView.setText(receivedName);
    }
}
