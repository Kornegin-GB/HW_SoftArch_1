package ru.gb;

import java.util.ArrayList;
import java.util.List;

import ru.gb.inmemory.ModelStore;
import ru.gb.inmemory.Observer1;
import ru.gb.inmemory.Observer2;
import ru.gb.model.Poligon;
import ru.gb.model.PoligonalModel;

public class Main {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();

        Observer2 observer2 = new Observer2();

        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);
        store.RegisterModelChanger(observer2);

        Poligon poligon1 = new Poligon();
        Poligon poligon2 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(poligon1);
        poligons.add(poligon2);

        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add(poligonalModel);
    }
}
