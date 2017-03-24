package com.ske.snakebaddesign.models;

import android.graphics.Color;

public class NormalSquare implements Square {

    private int color = Color.parseColor("#1dd2af");

    @Override
    public int getColor() {
        return color;
    }
}
