package Monster_Classes;

public class Vampires_Domain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monster m[]=new Monster[2];
        
        System.out.println("Monster Count: "+Monster.getMonsterCount());
        
        m[1]=new Zombie("Jamedi");
        m[0]=new Vampire("Silas Briarwood");
        //Override
        m[0].identify();
        m[1].identify();
        //Abstract
        m[0].attack();
        m[1].attack();
        
        ((Vampire)m[0]).Shapechange();
        ((Zombie)m[1]).frighten();
    
        System.out.println("Monster Count: "+m[1].getMonsterCount());
    }
    
}
