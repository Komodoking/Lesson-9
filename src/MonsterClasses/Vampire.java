
package MonsterClasses;

/**
 *
 * @author ajdy5510
 */
public class Vampire extends Monster {
    
    public Vampire(String nm) {
        super(nm);
        monstercount++;
    }

    @Override
    void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void identify(){
        super.identify();
        System.out.println("Vamipire ");
    }
    @Override
    public void attack(){
        System.out.println(" I am eating ur brains ");
    }
}
