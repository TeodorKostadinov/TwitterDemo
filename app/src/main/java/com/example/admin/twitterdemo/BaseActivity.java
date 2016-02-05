package com.example.admin.twitterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    protected void init(int resource) {
        ViewGroup container = (ViewGroup) findViewById(R.id.container);
        getLayoutInflater().inflate(resource, container, true);
        ButterKnife.bind(this);
        initToolbar();
        initFields();
        initViews();
        initListeners();
    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.drawable.logo_hdpi);
        getSupportActionBar().setTitle("Twitter");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void initFields() {

    }

    protected void initViews() {

    }

    protected void initListeners() {

    }
}
