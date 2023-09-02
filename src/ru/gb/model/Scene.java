package ru.gb.model;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private int id;
    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Scene(List<PoligonalModel> models, List<Camera> cameras) {
        this.models = models;
        this.cameras = cameras;
    }

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }
}
