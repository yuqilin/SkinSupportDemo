package com.github.iyql.colorful;

import android.support.annotation.ColorRes;

/**
 * Created by yuqilin on 2018/3/9.
 */

public class Colorful {

    public enum ThemeColor {
        BLACK("black", R.color.colorPrimary_black, R.color.colorPrimaryDark_black, R.color.colorPrimaryLight_black, R.color.colorAccent_black),
        RED("red", R.color.colorPrimary_red, R.color.colorPrimaryDark_red, R.color.colorPrimaryLight_red, R.color.colorAccent_red),
        PINK("pink", R.color.colorPrimary_pink, R.color.colorPrimaryDark_pink, R.color.colorPrimaryLight_pink, R.color.colorAccent_pink),
        PURPLE("purple", R.color.colorPrimary_purple, R.color.colorPrimaryDark_purple, R.color.colorPrimaryLight_purple, R.color.colorAccent_purple),
        DEEP_PURPLE("deep_purple", R.color.colorPrimary_deep_purple, R.color.colorPrimaryDark_deep_purple, R.color.colorPrimaryLight_deep_purple, R.color.colorAccent_deep_purple),
        INDIGO("indigo", R.color.colorPrimary_indigo, R.color.colorPrimaryDark_indigo, R.color.colorPrimaryLight_indigo, R.color.colorAccent_indigo),
        BLUE("blue", R.color.colorPrimary_blue, R.color.colorPrimaryDark_blue, R.color.colorPrimaryLight_blue, R.color.colorAccent_blue),
        LIGHT_BLUE("light_blue", R.color.colorPrimary_light_blue, R.color.colorPrimaryDark_light_blue, R.color.colorPrimaryLight_light_blue, R.color.colorAccent_light_blue),
        CYAN("cyan", R.color.colorPrimary_cyan, R.color.colorPrimaryDark_cyan, R.color.colorPrimaryLight_cyan, R.color.colorAccent_cyan),
        TEAL("teal", R.color.colorPrimary_teal, R.color.colorPrimaryDark_teal, R.color.colorPrimaryLight_teal, R.color.colorAccent_teal),
        GREEN("green", R.color.colorPrimary_green, R.color.colorPrimaryDark_green, R.color.colorPrimaryLight_green, R.color.colorAccent_green),
        LIGHT_GREEN("light_green", R.color.colorPrimary_light_green, R.color.colorPrimaryDark_light_green, R.color.colorPrimaryLight_light_green, R.color.colorAccent_light_green),
        LIME("lime", R.color.colorPrimary_lime, R.color.colorPrimaryDark_lime, R.color.colorPrimaryLight_lime, R.color.colorAccent_lime),
//        YELLOW("yellow", R.color.colorPrimary_yellow, R.color.colorPrimaryDark_yellow, R.color.colorPrimaryLight_yellow, R.color.colorAccent_yellow),
        AMBER("amber", R.color.colorPrimary_amber, R.color.colorPrimaryDark_amber, R.color.colorPrimaryLight_amber, R.color.colorAccent_amber),
        ORANGE("orange", R.color.colorPrimary_orange, R.color.colorPrimaryDark_orange, R.color.colorPrimaryLight_orange, R.color.colorAccent_orange),
        DEEP_ORANGE("deep_orange", R.color.colorPrimary_deep_orange, R.color.colorPrimaryDark_deep_orange, R.color.colorPrimaryLight_deep_orange, R.color.colorAccent_deep_orange);
//        BROWN("brown", R.color.colorPrimary_brown, R.color.colorPrimaryDark_brown, R.color.colorPrimaryLight_brown, R.color.colorAccent_brown),
//        GREY("grey",R.color.colorPrimary_grey, R.color.colorPrimaryDark_grey, R.color.colorPrimaryLight_grey, R.color.colorAccent_grey),
//        BLUE_GREY("blue_grey", R.color.colorPrimary_blue_grey, R.color.colorPrimaryDark_blue_grey, R.color.colorPrimaryLight_blue_grey, R.color.colorAccent_blue_grey),
//        WHITE("white", R.color.colorPrimary_white, R.color.colorPrimaryDark_white, R.color.colorPrimaryLight_white, R.color.colorAccent_white),

        private String themeName;
        @ColorRes private int colorPrimaryRes;
        @ColorRes private int colorPrimaryDarkRes;
        @ColorRes private int colorPrimaryLightRes;
        @ColorRes private int colorAccentRes;

        ThemeColor(String themeName, @ColorRes int colorPrimaryRes, @ColorRes int colorPrimaryDarkRes, @ColorRes int colorPrimaryLightRes, @ColorRes int colorAccentRes) {
            this.themeName = themeName;
            this.colorPrimaryRes = colorPrimaryRes;
            this.colorPrimaryDarkRes = colorPrimaryDarkRes;
            this.colorPrimaryLightRes = colorPrimaryLightRes;
            this.colorAccentRes = colorAccentRes;
        }

        public String getThemeName() {
            return themeName;
        }

        public @ColorRes int getColorPrimaryRes() {
            return colorPrimaryRes;
        }

        public @ColorRes int getColorPrimaryDarkRes() {
            return colorPrimaryDarkRes;
        }

        public @ColorRes int getColorPrimaryLightRes() {
            return colorPrimaryLightRes;
        }

        public @ColorRes int getColorAccentRes() {
            return colorAccentRes;
        }
    }
}
