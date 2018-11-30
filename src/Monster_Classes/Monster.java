package Monster_Classes;

import java.util.Objects;

/**
 *
 * @author feli8871
 */
abstract public class Monster {
    protected String name;
    /*
    Static - Class 
    Level - Applies to all objects.
    */
    protected static int monstercount=0;
    
    public Monster(String nm){
        name=Objects.requireNonNull(nm);
        monstercount++;
    }

    public static int getMonsterCount(){
        return monstercount;
    }
    
    abstract public void attack();
    
    public void identify(){
        System.out.print("I am"+name+" ");
    }
    
    
}
