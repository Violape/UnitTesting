package com.example.unittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onShow(View view){
        EditText et = findViewById(R.id.editText);
        String ctt = et.getText().toString();
        Toast tot = Toast.makeText(this, ctt, Toast.LENGTH_SHORT);
    }
}
