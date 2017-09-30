package com.varun.helloworlddsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Comment!
        final EditText inputName = (EditText) findViewById(R.id.edit_text);
        Button  submit = (Button) findViewById(R.id.button);
        //On Click we need to display the name in a new Activity(NameDisplayActivity)
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get Name from TextView
                String name = inputName.getEditableText().toString();
                //Create an Intent that will go from this screen to NameDisplayActivity
                //Think of the intent as an envelope
                //From address - this acitivity
                //To address - NameDisplayActivity
                Intent intent = new Intent(getApplicationContext(), NameDisplayActivity.class);
                //Add Extra to intent as the name the user just typed
                //Think of it as adding the information inside an envelope
                intent.putExtra("name_to_be_displayed",name);
                //Start the other Activity
                startActivity(intent);
            }
        });
        Button newAppButton = (Button) findViewById(R.id.new_app_button);
        newAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is the Activity for the CodeLab 1
                Intent intent = new Intent(getApplicationContext(), CodeLab1Activity.class);
                startActivity(intent);
            }
        });
    }
}
