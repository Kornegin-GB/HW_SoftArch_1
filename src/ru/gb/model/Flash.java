package ru.gb.model;

import java.util.List;

public class Flash {
    private List<Point3D> location;
    private List<Angle3D> angle;
    private float power;
    private Color color;

    public List<Point3D> getLocation() {
        return location;
    }

    public List<Angle3D> getAngle() {
        return angle;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public float getPower() {
        return power;
    }

    public Color getColor() {
        return color;
    }

    public void Rotate(List<Angle3D> angle) {
        this.angle = angle;
    }

    public void Move(List<Point3D> location) {
        this.location = location;
    }
}
