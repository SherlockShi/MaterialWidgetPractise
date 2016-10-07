package com.sherlockshi.materialwidgetpractise;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author: SherlockShi
 * Date:   2016-09-17 21:48
 * Description:
 */
public class BaseActivity extends AppCompatActivity {

    private NestedScrollView contentView = null;
    private Toolbar mToolbar;

    protected Toolbar getToolbar() {
        return mToolbar;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        if (contentView == null && R.layout.activity_base == layoutResID) {
            super.setContentView(R.layout.activity_base);
            contentView = (NestedScrollView) findViewById(R.id.nsv_content);
            contentView.removeAllViews();
        } else if (layoutResID != R.layout.activity_base) {
            View addView = LayoutInflater.from(this).inflate(layoutResID, null);
            contentView.addView(addView, new ViewGroup.LayoutParams(NestedScrollView.LayoutParams.MATCH_PARENT, NestedScrollView.LayoutParams.MATCH_PARENT));

            mToolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(mToolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }
}
