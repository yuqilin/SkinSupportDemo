package com.github.iyql.skinsupportdemo;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import skin.support.SkinCompatManager;
import skin.support.content.res.SkinCompatResources;
import skin.support.widget.SkinCompatSupportable;

public class MainActivity extends AppCompatActivity implements SkinCompatSupportable {

    String[] themeColors = {
            "red", "pink", "purple", "deep_purple", "green"
    };

    int clicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.change_theme).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SkinCompatManager.getInstance().loadSkin(themeColors[clicked++ % themeColors.length], null, SkinCompatManager.SKIN_LOADER_STRATEGY_BUILD_IN);
            }
        });
    }

    @Override
    public void applySkin() {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(SkinCompatResources.getColor(MainActivity.this, R.color.colorPrimary)));
    }
}
