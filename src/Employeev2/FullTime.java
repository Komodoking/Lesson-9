/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employeev2;


public class FullTime extends Employee {
    public FullTime(){
            super();
            
    }
    public double getPay(){
        double pay;
        if(hours>40)
            pay=(rate*40)+((rate*2)*(hours-40));
        else
            pay=(rate*hours);
        totalpay+=pay;
        return pay;
    }

    
    
}
