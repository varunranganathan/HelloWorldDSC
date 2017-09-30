package com.varun.helloworlddsc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CodeLab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_lab1);

        //Find the Three Buttons
        Button button1 = (Button) findViewById(R.id.toast_button);
        Button button2 = (Button) findViewById(R.id.count_button);
        Button button3 = (Button) findViewById(R.id.random_button);

        //Add a Listener for each button to do something when clicked
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CodeLab1Activity.this, "We made a toast!!!!", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Find the TextView
                TextView t = (TextView) findViewById(R.id.numberTextView);
                //Get the Number the TextView is currently displaying as String(TextView displays Strings)
                String num = t.getText().toString();
                //Convert it to int
                int realNum = Integer.parseInt(num);
                //Increment by 1
                realNum++;
                //Set the TextView with the new Number
                t.setText(String.valueOf(realNum));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rand = (int) (Math.random() * ( 15 - 0 ));
                //In the code lab they display the result in a new screen
                //Practise doing that
                //Create a new activity just to display the result
                //Pass the result as an extra to the intent
                //Get the extra in the new Activity you created
                //And display it
                Toast.makeText(CodeLab1Activity.this, String.valueOf(rand), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
