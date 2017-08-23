package com.example.android.booklistapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.booklistapp.BookActivity;
import com.example.android.booklistapp.R;

import static android.R.attr.button;
import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.search);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, BookActivity.class);

                EditText answer1 = (EditText) findViewById(R.id.searchtarget);
                Editable answer1Editable = answer1.getText();
                String a1 = answer1Editable.toString();
                numbersIntent.putExtra("some_other_key", a1);

                startActivity(numbersIntent);

            }
        });

    }


}