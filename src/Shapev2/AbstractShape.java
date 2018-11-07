package Shapev2;

import TurtleGraphics.Pen;

abstract public class AbstractShape {

    protected double xpos, ypos;

    public AbstractShape() {
        xpos = 0;
        ypos = 0;

    }

    public AbstractShape(double x, double y) {
        xpos = x;
        ypos = y;
    }

    public abstract void draw(Pen p);
    public abstract double area();
    public abstract void stretchby(double factor);
public abstract double perimeter();
    public final double getxpos() {
        return xpos;
    }

    public final double getypos() {
        return ypos;
    }

    public void move(double x, double y) {
        xpos = x;
        ypos = y;

    }

    public String toString() {
        String str = "";

        str += "Xpos " + xpos + " Ypos " + ypos + "\n";
        str += " area " + area();
        return str;
    }
}
