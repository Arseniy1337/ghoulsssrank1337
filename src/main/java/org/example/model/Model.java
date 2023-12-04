package org.example.model;

import org.springframework.stereotype.Component;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Observable;
import java.util.ArrayList;
import java.util.List;

@Component
public class Model extends Observable {
    private MyShape currentShape;
    private List<MyShape> shapes;

    public Model() {
        shapes = new ArrayList<>();
    }

    public void setMyShape(MyShape myShape) {
        this.currentShape = myShape;
    }

    public void changeShape(Point2D[] pd) {
        currentShape.setFrame(pd);
        this.setChanged();
        this.notifyObservers();
    }

    public void draw(Graphics2D g) {
        for (MyShape shape : shapes) {
            shape.draw(g);
        }
        currentShape.draw(g);
    }

    public void createCurrentShape(MyShape shape) {
        currentShape = shape;
        shapes.add(shape);
    }
}



