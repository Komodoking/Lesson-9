/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev2;

import TurtleGraphics.*;

/**
 *
 * @author ajdy5510
 */
public class Circ extends AbstractShape {

    protected double radius;

    public Circ() {
        super(0, 0);
        radius = 1;

    }

    public Circ(double x, double y, double r) {
        super(x, y);
        xpos = x;
        ypos = y;
        radius = r;
    }

    public void draw(Pen p) {
        double side = Math.PI * 2 * radius / 120;
        p.up();
        p.move(xpos, ypos);
        p.setDirection(0);
        p.move(radius);
        p.down();
        p.turn(90);
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }

    }

    

    public void stretchby(double factor) {
        radius*=factor;
    }


    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return Math.PI*2*radius;
    }

    public String toString() {
        String str = "Circle\n-------\n";
        str += "Radius " + radius + "\n";
        str += super.toString();
        str += "area " + area();

        return str;
    }

}
