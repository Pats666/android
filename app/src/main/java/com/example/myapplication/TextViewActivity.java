package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv3,mTv4,mTv5,mTv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv3 = findViewById(R.id.tv_3);
        mTv3.getPaint().setFlags((Paint.STRIKE_THRU_TEXT_FLAG));   //中划线
        mTv3.getPaint().setAntiAlias(true); //去除锯齿

        mTv4 = findViewById((R.id.tv_4));
        mTv4.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        mTv5 = findViewById(R.id.tv_5);
        mTv5.setText((Html.fromHtml("<a>this is a label</a>")));

        mTv6 = findViewById(R.id.tv_6);
        mTv6.setSelected(true);

    }
}