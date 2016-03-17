package com.yuemei.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tex();
    }


    void tex(){
        Toast.makeText(MainActivity.this,"ss",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"aa",Toast.LENGTH_SHORT).show();
    }

}
