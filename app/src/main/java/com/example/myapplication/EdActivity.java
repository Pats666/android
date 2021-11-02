package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EdActivity extends AppCompatActivity {

    private Button Bt_1;
    private EditText User;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ed);
        Bt_1 = findViewById(R.id.bt_1);
        Bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EdActivity.this,"登录成功",Toast.LENGTH_LONG).show();
            }
        });

        User = findViewById(R.id.et1);
        User.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edittext",s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}