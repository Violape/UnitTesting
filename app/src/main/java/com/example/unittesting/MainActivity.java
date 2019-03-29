package com.example.unittesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        EditText et = findViewById(R.id.editText);
        String ctt = et.getText().toString();
        Toast tot = Toast.makeText(this, ctt, Toast.LENGTH_SHORT);
        /*
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Main2Activity.class);
        startActivity(intent);
        */
    }
}
