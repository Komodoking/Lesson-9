/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterInterface;

public class Zombire implements Monster{

            private String name;
       public Zombire(String n){
            name=n;
    }
    @Override
    public void attack() {
        System.out.println("Zombire attacks!");
    }

    @Override
    public void identify() {
        System.out.println("I am "+name+"the zombire");
    }
}
