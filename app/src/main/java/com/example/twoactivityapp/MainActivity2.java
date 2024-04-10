package com.example.twoactivityapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText editText2;
    private Button btn2;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity2);

        Intent intent=getIntent();
        String msg=intent.getStringExtra("Data");

        editText2=findViewById(R.id.edit2);
         editText2.setText(msg);


    }
}
