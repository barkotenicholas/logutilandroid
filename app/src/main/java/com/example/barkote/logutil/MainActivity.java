 package com.example.barkote.logutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.logutil2.LogDebug;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         int a =LogDebug.Plus(1,1);

        Toast.makeText(MainActivity.this,"answer is "+a,Toast.LENGTH_SHORT).show();

    }
}
