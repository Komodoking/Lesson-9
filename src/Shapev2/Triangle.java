
package Shapev2;
import TurtleGraphics.*;
public class Triangle extends AbstractShape {

protected double px2,py2,px3,py3;
public Triangle(){
    super(0,0);
    px2=0;
    py2=0;
    px3=0;
    py3=0;
}
public Triangle(double p1x,double p1y, double p2x,double p2y, double p3x, double p3y){
    super(p1x,p1y);
   xpos=p1x;
   ypos=p1y;
   px2=p2x;
    py2=p2y;
    px3=p3x;
    py3=p3y;
}

   
    public void draw(Pen p) {
        p.up();
       p.move(xpos,ypos);
       p.setDirection(120);
       p.down();
      p.move(px2,py2);
      p.up();
      p.turn(-120);
      p.down();
      p.move(px3,py3);
      p.up();
      p.turn(120);
      p.down();
      p.move(xpos, ypos);
     
        
    }

    
    public double area() {
        return Math.abs((xpos*py2-px2*ypos)+(px2*py3-px3*py2)+(px3+ypos-xpos*py3)/2);
    }


 public final void move(double x, double y) {
     x= Math.abs((xpos-x));
     y= Math.abs((ypos-y));
        xpos = xpos+x;
        ypos = ypos+y;
        px2=px2+x;
    py2=py2+y;
    px3=px3+x;
    py3=py3+y;

    }
    
    public void stretchby(double factor) {
    px2=(px2-xpos)*factor+xpos;
    py2=(py2-xpos)*factor+ypos;
    px3=(px3-xpos)*factor+xpos;
    py3=(py3-xpos)*factor+ypos;
    }

    public double perimeter() {
      return Math.sqrt((xpos-px2)*(xpos-px2)+(ypos-py2)*(ypos-py2));
    }
    
}
