package ru.mirea.chudnevtsevmr.sharer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void onClickSend(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
        intent.setType("*/*");
        String text = String.valueOf(editText.getText());
        intent.putExtra(Intent.EXTRA_TEXT, text);
        startActivity(Intent.createChooser(intent, "Выбор за вами!"));
    }
}