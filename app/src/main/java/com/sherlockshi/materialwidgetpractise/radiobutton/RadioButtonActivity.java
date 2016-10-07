package com.sherlockshi.materialwidgetpractise.radiobutton;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.sherlockshi.materialwidgetpractise.BaseActivity;
import com.sherlockshi.materialwidgetpractise.R;

/**
 * Author: SherlockShi
 * Date:   2016-10-06 18:53
 * Description:
 */

public class RadioButtonActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_radio_button);

        getToolbar().setTitle(R.string.radio_button);
    }
}
