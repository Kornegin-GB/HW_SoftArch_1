package ru.gb.model;

import java.util.List;

public class Camera {
    private List<Point3D> location;
    private List<Angle3D> angle;

    public List<Point3D> getLocation() {
        return location;
    }

    public List<Angle3D> getAngle() {
        return angle;
    }

    public void Rotate(List<Angle3D> angle) {
        this.angle = angle;
    }

    public void Move(List<Point3D> location) {
        this.location = location;
    }
}
