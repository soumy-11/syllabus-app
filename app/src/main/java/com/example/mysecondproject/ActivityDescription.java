package com.example.mysecondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.mysecondproject.R.id.imageviewid;
import static com.example.mysecondproject.R.id.textviewid;

public class ActivityDescription extends AppCompatActivity {
    private ImageView imageview;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        imageview = findViewById(imageviewid);
        textview = findViewById(textviewid);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String subject = bundle.getString("name");
            showdetails(subject);
        }

    }
    void showdetails(String subject)
    {
        if(subject.equals("cse"))
        {

            imageview.setImageResource(R.drawable.cse);
            textview.setText(R.string.cse_text);
        }
        if(subject.equals("eee"))
        {

            imageview.setImageResource(R.drawable.eee);
            textview.setText(R.string.eee_text);
        }
        if(subject.equals("me"))
        {

            imageview.setImageResource(R.drawable.me);
            textview.setText(R.string.me_text);
        }
        if(subject.equals("ce"))
        {

            imageview.setImageResource(R.drawable.ce);
            textview.setText(R.string.ce_text);
        }
    }
}

