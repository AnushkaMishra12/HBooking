package com.example.hotalbooking;

public class AutoData {
    private int img;
    private String text;
    private boolean isVisible;
    private boolean isToggleable;

    public AutoData(int img, String text, boolean isToggleable) {
        this.img = img;
        this.text = text;
        this.isVisible = isToggleable;
        this.isToggleable = isToggleable;
    }

    public int getImg() {
        return img;
    }

    public String getText() {
        return text;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public boolean isToggleable() {
        return isToggleable;
    }
}
