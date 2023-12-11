package com.example.dayotravelaccess;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dayotravelaccess.dashboard;
import com.example.dayotravelaccess.history;
import com.example.dayotravelaccess.transaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.ic_transaction);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case 1:
                intent = new Intent(MainActivity.this, dashboard.class);
                startActivity(intent);
                return true;
            case 2:
                intent = new Intent(MainActivity.this, transaction.class);
                startActivity(intent);
                return true;
            case 3:
                intent = new Intent(MainActivity.this, account.class);
                startActivity(intent);
                return true;
        }
        return false;
    }
}