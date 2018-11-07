/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev2;

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

/**
 *
 * @author ajdy5510
 */
public class Rect extends AbstractShape{
    
protected double width, height;
public Rect(){
    super(0,0);
width=0;
height=0;

}
public Rect(double x,double y,double w,double h){
    super(x,y);
    
    width=w;
    height=h;
}

 
    public void draw(Pen p) {
       p.up();
       p.move(xpos,ypos);
       p.setDirection(0);
       p.down();
        for (int i = 0; i < 2; i++) {
            p.move(width);
       p.turn(-90);
       p.move(height);
       p.turn(-90);
        }
       
       
    }

    

    public void stretchby(double factor) {
      width*=factor;
      height+=factor;
    }


   
    public double area() {
       return width*height;
    }
    public double perimeter(){
        return width+height+width+height;
    }
     public String toString(){
                String str="Rectangle\n-------\n";
                str+="width "+width+"Height"+height+"\n";
        str+="Xpos"+xpos+"Ypos"+ypos+"\n";
        str+="area "+area();
        
     return str;   
     
    }

   
    
}
