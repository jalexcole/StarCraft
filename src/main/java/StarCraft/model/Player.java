package StarCraft.model;

import java.util.ArrayList;

public class Player {

    private long id;
    private long teamId;

    private Integer resource1;
    private Integer resource2;

    private ArrayList<Unit> units = new ArrayList<>();
    private ArrayList<Building> buildings = new ArrayList<>();

    public void select() {
        // recieves controller data of what is selected

    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> building) {
        this.buildings = building;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }

    public Integer getResource2() {
        return resource2;
    }

    public void setResource2(Integer resource2) {
        this.resource2 = resource2;
    }

    public Integer getResource1() {
        return resource1;
    }

    public void setResource1(Integer resource1) {
        this.resource1 = resource1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addBuilding() {

    }

    public void removeBuilding() {

    }

    public void addUnit() {
        
    }


}
