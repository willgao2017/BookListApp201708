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

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.R.attr.button;
import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, BookActivity.class);
                EditText searchtarget = (EditText) findViewById(R.id.searchtarget);
                Editable searchtext = searchtarget.getText();
                String a1 = searchtext.toString();
                numbersIntent.putExtra("search_key", a1);
                startActivity(numbersIntent);
            }
        });
    }
}