package com.example.admin.twitterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    protected void init(int resource) {
        ViewGroup container = (ViewGroup) findViewById(R.id.container);
        getLayoutInflater().inflate(resource, container, true);
        ButterKnife.bind(this);
        initFields();
        initViews();
        initListeners();
    }

    protected void initFields() {

    }

    protected void initViews() {

    }

    protected void initListeners() {

    }
}
