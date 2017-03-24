package com.ske.snakebaddesign.models;

import android.graphics.Color;

public class RedSquare implements Square {

    private int color = Color.parseColor("#e67e22");

    @Override
    public int getColor() {
        return color;
    }
}
