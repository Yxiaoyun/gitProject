package com.cloud.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_content).setOnClickListener(view->{
            Toast.makeText(this,"hello world",Toast.LENGTH_SHORT).show();
        });

    }
}
