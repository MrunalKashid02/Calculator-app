package com.example.samplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText No1, No2;
    TextView No3;
    Button B1, B2, B3, B4;
    Double n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        No1= findViewById(R.id.Number1Edit);
        No2= findViewById(R.id.Number2Edit);
        No3= findViewById(R.id.ResultText);

        B1= findViewById(R.id.Addbtn);
        B2= findViewById(R.id.Subbtn);
        B3= findViewById(R.id.Mulbtn);
        B4= findViewById(R.id.Divbtn);

        // when we will  click on the Button 1 which is for Addition
        B1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if ((No1.getText().length() > 0) && (No2.getText().length() > 0))
                {
                    n1 = Double.parseDouble(No1.getText().toString()); // the No1 value which is string is converted into the double for addition
                    n2 = Double.parseDouble(No2.getText().toString()); // the No2 value which is string is converted into the double for additi
                    n3 = n1 + n2; // Addition of No1 and No2

                    No3.setText(String.valueOf(n3)); // n3 is double value which is converted into the double for addition
                }
                else{
                        String result = "Please Enter the correct details";
                        No3.setText(result);


                }
;           }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((No1.getText().length() > 0) && (No2.getText().length() > 0))
                {
                    n1 = Double.parseDouble(No1.getText().toString()); // the No1 value which is string is converted into the double for addition
                    n2 = Double.parseDouble(No2.getText().toString()); // the No2 value which is string is converted into the double for additi
                    n3 = n1 - n2; // Addition of No1 and No2

                    No3.setText(String.valueOf(n3)); // n3 is double value which is converted into the double for addition
                }
                else{
                    String result = "Please Enter the correct details";
                    No3.setText(result);

                }

            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((No1.getText().length() > 0) && (No2.getText().length() > 0))
                {
                    n1 = Double.parseDouble(No1.getText().toString()); // the No1 value which is string is converted into the double for addition
                    n2 = Double.parseDouble(No2.getText().toString()); // the No2 value which is string is converted into the double for additi
                    n3 = n1 * n2; // Addition of No1 and No2

                    No3.setText(String.valueOf(n3)); // n3 is double value which is converted into the double for addition
                }
                else{
                    String result = "Please Enter the correct details";
                    No3.setText(result);
                }

            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if ((No1.getText().length() > 0) && (No2.getText().length() > 0))
                {
                    n1 = Double.parseDouble(No1.getText().toString()); // the No1 value which is string is converted into the double for addition
                    n2 = Double.parseDouble(No2.getText().toString()); // the No2 value which is string is converted into the double for additi
                    n3 = n1 / n2; // Addition of No1 and No2

                    No3.setText(String.valueOf(n3)); // n3 is double value which is converted into the double for addition
                }
                else{
                    String result = "Please Enter the correct details";
                    No3.setText(result);
                }


            }
        });
    }
}