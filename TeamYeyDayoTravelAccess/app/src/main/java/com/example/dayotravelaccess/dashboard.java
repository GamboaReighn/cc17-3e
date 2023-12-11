package com.example.dayotravelaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView pckge1 = findViewById(R.id.baguioPackage);
        TextView package1 = findViewById(R.id.sjPackage);
        TextView package2 = findViewById(R.id.alaminos);
        TextView package3 = findViewById(R.id.vigan);
        TextView package4 = findViewById(R.id.bolinao);
        TextView package5 = findViewById(R.id.sagada);
        TextView package6 = findViewById(R.id.sablan);
        TextView package7 = findViewById(R.id.manila);
        TextView package8 = findViewById(R.id.agoo);



        pckge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pckge1 = new Intent(dashboard.this, packages.class);
                startActivity(pckge1);
            }
        });

        package1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent package1 = new Intent(dashboard.this, sanjuan.class);
                startActivity(package1);
            }
        });

        package2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent package2 = new Intent(dashboard.this, alaminos.class);
                startActivity(package2);
            }
        });

        package3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent package3 = new Intent(dashboard.this, vigan.class);
                startActivity(package3);
            }
        });

        package4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent package4 = new Intent(dashboard.this, bolinao.class);
                startActivity(package4);
            }
        });

        package5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent package5 = new Intent(dashboard.this, sagada.class);
                startActivity(package5);
            }
        });




        package6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent package6 = new Intent(dashboard.this, sablan.class);
                startActivity(package6);
            }
        });

        package7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent package7 = new Intent(dashboard.this, manila.class);
                startActivity(package7);
            }
        });


        package8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent package8 = new Intent(dashboard.this, agoo.class);
                startActivity(package8);
            }
        });




    }
}