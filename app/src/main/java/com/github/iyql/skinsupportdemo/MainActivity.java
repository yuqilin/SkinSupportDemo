package com.github.iyql.skinsupportdemo;

import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.iyql.colorful.ColorPickerDialog;
import com.github.iyql.colorful.Colorful;

import skin.support.SkinCompatManager;
import skin.support.content.res.SkinCompatResources;
import skin.support.widget.SkinCompatSupportable;

public class MainActivity extends AppCompatActivity {

    String[] themeColors = {
            "red", "pink", "purple", "deep_purple", "green"
    };

    int clicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        findViewById(R.id.change_theme_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SkinCompatManager.getInstance().loadSkin(themeColors[clicked++ % themeColors.length], null, SkinCompatManager.SKIN_LOADER_STRATEGY_BUILD_IN);
                ColorPickerDialog colorPickerDialog = new ColorPickerDialog();
                colorPickerDialog.setOnColorSelectedListener(new ColorPickerDialog.OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(Colorful.ThemeColor color) {
                        SkinCompatManager.getInstance().loadSkin(color.getThemeName(), null, SkinCompatManager.SKIN_LOADER_STRATEGY_BUILD_IN);
                    }
                });
                colorPickerDialog.show(getSupportFragmentManager(), "colorPicker");
            }
        });
    }

//    @Override
//    public void applySkin() {
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(SkinCompatResources.getColor(MainActivity.this, R.color.colorPrimary)));
//    }
}
