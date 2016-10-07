package com.sherlockshi.materialwidgetpractise.button;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.sherlockshi.materialwidgetpractise.BaseActivity;
import com.sherlockshi.materialwidgetpractise.R;

/**
 * Author: SherlockShi
 * Date:   2016-10-06 14:29
 * Description:
 */

public class FourStylesButtonActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_four_styles_button);
        getToolbar().setTitle(R.string.four_styles_button);
    }
}
