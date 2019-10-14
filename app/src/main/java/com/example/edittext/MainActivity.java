package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText number1EditText1, number2EditText2;
    private Button add_Button, sub_Button;
    private TextView result_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText1 = findViewById(R.id.number1_EditText);
        number2EditText2 = findViewById(R.id.number2_EditText);
        add_Button = findViewById(R.id.add_Button);
        sub_Button = findViewById(R.id.sub_Button);
        result_TextView = findViewById(R.id.result_TextView);

        add_Button.setOnClickListener(this);
        sub_Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        try {
            String number1 = number1EditText1.getText().toString();
            String number2 = number2EditText2.getText().toString();

            //Converting into Double
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId()==R.id.add_Button){
                double sum = num1+num2;
                result_TextView.setText("Result is  " +sum);
            } if (v.getId()==R.id.sub_Button){
                double sub = num1-num2;
                result_TextView.setText("Result is  " +sub);
            }
        }catch (Exception e){
            Toast.makeText(MainActivity.this, "Please Enter Number", Toast.LENGTH_SHORT).show();
        }

    }
}
