package com.sherlockshi.materialwidgetpractise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sherlockshi.materialwidgetpractise.button.FourStylesButtonActivity;
import com.sherlockshi.materialwidgetpractise.button.VariousColorsButtonActivity;
import com.sherlockshi.materialwidgetpractise.checkbox.CheckBoxActivity;
import com.sherlockshi.materialwidgetpractise.radiobutton.RadioButtonActivity;
import com.sherlockshi.materialwidgetpractise.switchbutton.SwitchActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getToolbar().setTitle(R.string.app_name);
    }

    public void jumpToFourStylesButtonActivity(View view) {
        startActivity(new Intent(MainActivity.this, FourStylesButtonActivity.class));
    }

    public void jumpToVariousColorsButtonActivity(View view) {
        startActivity(new Intent(MainActivity.this, VariousColorsButtonActivity.class));
    }

    public void jumpToCheckBoxActivity(View view) {
        startActivity(new Intent(MainActivity.this, CheckBoxActivity.class));
    }

    public void jumpToRadioButtonActivity(View view) {
        startActivity(new Intent(MainActivity.this, RadioButtonActivity.class));
    }

    public void jumpToSwitchActivity(View view) {
        startActivity(new Intent(MainActivity.this, SwitchActivity.class));
    }
}
