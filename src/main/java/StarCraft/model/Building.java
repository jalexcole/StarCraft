package StarCraft.model;

import java.util.ArrayList;

public class Building extends Entity {
    
    private long id;
    private long playerId;

    private int maxHealth;
    private int health;
    
    ArrayList<Unit> buildingQue = new ArrayList<>();
    Boolean queRunning = true; // used to determine if there is an interuption on making units.

    public void addUnitToQue(Unit unit) {

    }

    public void repair(Integer amount){
        if (health < maxHealth) {
            health += amount;
        }
    }

    


}
