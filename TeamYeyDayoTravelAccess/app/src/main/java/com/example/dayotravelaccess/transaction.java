package com.example.dayotravelaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class transaction extends AppCompatActivity {
    private DatePickerDialog datePickerDialog;
    private Button dateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        initDatePicker();
        dateButton = findViewById(R.id.datePicker);


        Button reserve = (Button) findViewById(R.id.Reserve);
        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                datePickerDialog.show();
                Intent intent = new Intent(transaction.this, paymentmbaguio.class);
                startActivity(intent);
                Intent sj = new Intent(transaction.this, paymentsj.class);
                startActivity(sj);


            }
        });



    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                String date = makeDateString(day, month, year);
                dateButton.setText(date);
            }


            private String makeDateString(int day, int month, int year) {
                return getMonthFormat(month) + "" + day + "" + year;
            }

            private String getMonthFormat(int month) {
                if (month == 1)
                    return "JAN";
                if (month == 2)
                    return "FEB";
                if (month == 3)
                    return "MARCH";
                if (month == 4)
                    return "APR";
                if (month == 5)
                    return "MAY";
                if (month == 6)
                    return "JUNE";
                if (month == 7)
                    return "JULY";
                if (month == 8)
                    return "AUG";
                if (month == 9)
                    return "SEPT";
                if (month == 10)
                    return "OCT";
                if (month == 11)
                    return "NOV";
                if (month == 12)
                    return "DEC";

                return "JAN";
            }
        };
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);



    }
}

