package com.example.dropmenu.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.app.Activity;

import butterknife.ButterKnife;

/**
 * Created by zhonghang on 2016/10/4.
 */

public abstract class BaseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initViews();
        initData();
    }

    public abstract void initViews();

    public abstract void initData();

    public abstract int getLayoutId();

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
