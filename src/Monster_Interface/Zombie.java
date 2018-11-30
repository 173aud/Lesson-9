package Monster_Interface;

public class Zombie implements Monster{
    private String name;
    
    public Zombie(String n){
        name=n;
    }
    
    public void attack(){
        System.out.println("Slam: Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) bludgeoning damage.");
    }
    
    public void identify(){
        System.out.println("This zombie's true name is "+name);
    }
    
    public void frighten(){
        System.out.println("Make a wisdom saving through, DC 12, or be frightened until the end of your next turn.");
    }
}
