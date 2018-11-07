package MonsterClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajdy5510
 */
abstract public class Monster {
    protected String name;
    //static = class-level= applies to all objects
    protected static int monstercount=0;
    
    Monster(String nm){
        name=nm;
    }
    abstract void attack();
    public  void identify(){
        System.out.print("I am "+" name "+" the " );
    }
    public int getMonsterCount(){
        return monstercount;
    }
        
    
}
