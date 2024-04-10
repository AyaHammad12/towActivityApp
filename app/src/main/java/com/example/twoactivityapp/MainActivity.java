package com.example.twoactivityapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        editText1=findViewById(R.id.editText1);
        btn1=findViewById(R.id.btn1);


        btn1.setOnClickListener(e->{

            String msg=editText1.getText().toString();
            if (msg.isEmpty()){
                msg="impty msg";
            }

            Intent intent=new Intent(MainActivity.this, MainActivity2.class);
             intent.putExtra("Data",msg);
             startActivity(intent);
        });


    }
}