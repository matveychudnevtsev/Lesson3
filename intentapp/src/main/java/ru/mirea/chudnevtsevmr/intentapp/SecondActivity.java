package ru.mirea.chudnevtsevmr.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.tvOut);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String text = extras.getString("message");
            tv.setText(text);
        }
    }
}