package com.example.test13settersgetters;

public class SetGet {
    private double x = 0.0;
    private double y = 0.0;

    public SetGet (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public SetGet () {
        this.x = 0.5;
        this.y = 0.5;
    }


public double getX() {
        return x;
}
public void setX(double x) {
        this.x = x;
}

public double getY() {
        return  y;
}
    public void setY(double y) {
        this.y = y;
    }
}
