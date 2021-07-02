package com.company;

public class Point3D extends Point2D {
    private float z;
    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public float[] getXYZ() {
        return new float[] {getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
               "x=" + getX() +
               ", y=" + getY() +
               ", z=" + getZ() +
               '}';
    }
}