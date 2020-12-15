package com.example.registrationform;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder builder;
    //Initialize variables
    private EditText Name,nametext,Phone,phonetext,editTextNumber;
    private Button Submit;

   private RadioButton radioButton,radioButton2;
   private CheckBox checkBox,checkBox2,checkBox3,checkBox4,checkBox5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(this);
        nametext = (EditText) findViewById(R.id.nametext);
        phonetext = (EditText) findViewById(R.id.phonetext);
        editTextNumber=(EditText)findViewById(R.id.editTextNumber);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        checkBox4=(CheckBox)findViewById(R.id.checkBox4);
        checkBox5=(CheckBox)findViewById(R.id.checkBox5);
        Submit = (Button) findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nametext.getText().toString();
                builder.setMessage("Form Submitted. Thank You for your information  "+name);

                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Message");
                alert.show();
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    checkBox.setEnabled(false);
                    checkBox2.setEnabled(false);
                    checkBox3.setEnabled(false);
                    checkBox4.setEnabled(false);
                }
                else
                {
                    checkBox5.setEnabled(true);
                    checkBox.setEnabled(true);
                    checkBox2.setEnabled(true);
                    checkBox3.setEnabled(true);
                    checkBox4.setEnabled(true);
                }
            }
        });

    }
}