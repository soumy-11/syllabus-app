package com.example.mysecondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static com.example.mysecondproject.R.id.cebuttonid;
import static com.example.mysecondproject.R.id.csebuttonid;
import static com.example.mysecondproject.R.id.eeebuttonid;
import static com.example.mysecondproject.R.id.mebuttonid;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button cseButton, eeeButton, meButton, ceButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cseButton=findViewById(csebuttonid);
        eeeButton=findViewById(eeebuttonid);
        meButton=findViewById(mebuttonid);
        ceButton=findViewById(cebuttonid);

        cseButton.setOnClickListener(this);
        eeeButton.setOnClickListener(this);
        meButton.setOnClickListener(this);
        ceButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == csebuttonid) {
            intent = new Intent(MainActivity.this, ActivityDescription.class);
            intent.putExtra("name", "cse");
            startActivity(intent);

        }

        if (view.getId() == eeebuttonid) {
            intent = new Intent(MainActivity.this, ActivityDescription.class);
            intent.putExtra("name", "eee");
            startActivity(intent);

        }

        if (view.getId() == mebuttonid) {
            intent = new Intent(MainActivity.this, ActivityDescription.class);
            intent.putExtra("name", "me");
            startActivity(intent);

        }

        if (view.getId() == cebuttonid) {
            intent = new Intent(MainActivity.this, ActivityDescription.class);
            intent.putExtra("name", "ce");
            startActivity(intent);

        }
    }

    }

