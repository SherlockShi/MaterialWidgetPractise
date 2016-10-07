package com.sherlockshi.materialwidgetpractise.checkbox;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.sherlockshi.materialwidgetpractise.BaseActivity;
import com.sherlockshi.materialwidgetpractise.R;

/**
 * Author: SherlockShi
 * Date:   2016-10-06 18:19
 * Description:
 */

public class CheckBoxActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_checkbox);

        getToolbar().setTitle(R.string.checkbox);
    }
}
