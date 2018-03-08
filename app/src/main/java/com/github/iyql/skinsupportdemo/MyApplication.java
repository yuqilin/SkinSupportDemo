package com.github.iyql.skinsupportdemo;

import android.app.Application;

import skin.support.SkinCompatManager;
import skin.support.design.app.SkinMaterialViewInflater;

/**
 * Created by yuqilin on 2018/3/7.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinCompatManager.withoutActivity(this)
//                .addStrategy(new CustomSDCardLoader())          // 自定义加载策略，指定SDCard路径
                .addInflater(new SkinMaterialViewInflater())    // material design
//                .addInflater(new SkinConstraintViewInflater())  // ConstraintLayout
//                .addInflater(new SkinCardViewInflater())        // CardView v7
//                .addInflater(new SkinCircleImageViewInflater()) // hdodenhof/CircleImageView
//                .addInflater(new SkinFlycoTabLayoutInflater())  // H07000223/FlycoTabLayout
//                .setSkinStatusBarColorEnable(false)             // 关闭状态栏换肤
//                .setSkinWindowBackgroundEnable(false)           // 关闭windowBackground换肤
//                .setSkinAllActivityEnable(false)                // true: 默认所有的Activity都换肤; false: 只有实现SkinCompatSupportable接口的Activity换肤
                .loadSkin();
    }
}
