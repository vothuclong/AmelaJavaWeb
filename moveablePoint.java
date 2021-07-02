package com.company;

public class moveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public moveablePoint() {
    }

    public moveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public moveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "moveablePoint{" +
                "x = " + getX() +
                ", y = " + getY() +
                ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }
    public moveablePoint move() {
        float x_new = getX() + this.xSpeed;
        float y_new = getY() + this.ySpeed;
        setX(x_new);
        setY(y_new);
        return this;
    }
}
