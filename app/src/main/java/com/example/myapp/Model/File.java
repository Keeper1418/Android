package com.example.myapp.Model;

public class File {
    private String filename;
    private Color color;
    private String stopOnRelease;

    public String getFilename() { return filename; }
    public void setFilename(String value) { this.filename = value; }

    public Color getColor() { return color; }
    public void setColor(Color value) { this.color = value; }

    public String getStopOnRelease() { return stopOnRelease; }
    public void setStopOnRelease(String value) { this.stopOnRelease = value; }
}
