package org.example.controller.action;

import org.example.model.Model;
import org.example.model.MyShape;

import java.awt.*;
import java.awt.geom.Point2D;

public class ActionDraw {
    private MyShape sampleShape;
    private MyShape shape;
    private Point2D[] points;
    private Model model;
    private Point2D[] p;

    public ActionDraw(MyShape sampleShape, MyShape shape, Point2D[] points, Model model) {
        this.sampleShape = sampleShape;
        this.shape = shape;
        this.points = points;
        this.model = model;
    }

    public MyShape getSampleShape() {
        return sampleShape;
    }

    public MyShape getShape() {
        return shape;
    }

    public Model getModel() {
        return model;
    }

    public Point[] getPoints() {
        return (Point[]) points;
    }

    public void createShape(Point point) {
        p[0] = (Point2D) point;
        shape = sampleShape.clone();
        model.createCurrentShape(shape);
    }

    public void stretchShape(Point point) {
        p[1] = (Point2D) point;
        shape.setFrame(p);
    }
}


