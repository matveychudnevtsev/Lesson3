package ru.mirea.chudnevtsevmr.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText editTextBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextBook = findViewById(R.id.editTextBook);
    }

    public void onClickSend(View view) {
        Intent data = new Intent();
        String text = String.valueOf(editTextBook.getText());
        data.putExtra(MainActivity.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}