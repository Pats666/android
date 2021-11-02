package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button b_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        b_2 = findViewById(R.id.b_2);
        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"b2 has been clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this,"asdf",Toast.LENGTH_LONG).show();
    }

}