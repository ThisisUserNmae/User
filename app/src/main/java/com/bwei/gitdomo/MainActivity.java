package com.bwei.gitdomo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView loginTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        initDatas();

    }

    private void initDatas() {

        loginTv.setText("这个一个GitDemo");

    }

    private void initViews() {

        loginTv = findViewById(R.id.tv_login);

    }
}
