package com.example.myapp.Model;

import java.io.IOException;

public enum Color {
    BLUE, GREEN, PURPLE, RED, YELLOW;

    public String toValue() {
        switch (this) {
            case BLUE: return "blue";
            case GREEN: return "green";
            case PURPLE: return "purple";
            case RED: return "red";
            case YELLOW: return "yellow";
        }
        return null;
    }

    public static Color forValue(String value) throws IOException {
        if (value.equals("blue")) return BLUE;
        if (value.equals("green")) return GREEN;
        if (value.equals("purple")) return PURPLE;
        if (value.equals("red")) return RED;
        if (value.equals("yellow")) return YELLOW;
        throw new IOException("Cannot deserialize Color");
    }
}
