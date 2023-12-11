package com.example.dayotravelaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class agootransaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agootransaction);

        Button bookNow9 = (Button) findViewById(R.id.bookNow10);
        bookNow9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(agootransaction.this, transaction.class);
                startActivity(intent);
            }
        });
    }
}