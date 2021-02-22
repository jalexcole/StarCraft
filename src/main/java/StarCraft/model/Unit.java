package StarCraft.model;

import java.util.Set;

public class Unit extends Entity {
    
    private long id;
    private long playerId;

    private String unitName;
    private Integer maxHealth;
    private Integer maxShield;
    private Integer health;
    private Integer shield;
    private Integer attack;
    private Integer range;

    private Boolean canBuild = false;
    private Boolean hasShield = false;
    private Boolean canRegenerate = false;

    private int xlocation;
    private int ylocation;


    // Stuff the unit does after being created
    private Boolean isAttacking = false;
    private long targetId; // This value is for the target that the unit is operating on. 


    public static class Builder {
        private String unitName;
        private Integer maxHealth = 1;
        private Integer maxShield = 0;
        private Integer attack = 0;
        private Integer range = 0;

        public Integer shieldRegeneration = 0;
        public Integer healthRegeneration = 0;

        private Boolean canBuild = false;
    

        public Builder(String unitName) {
            this.unitName = unitName;
        }

        public Builder setHealth(Integer maxHealth) {
            this.maxHealth = maxHealth;
            return this;
        }

        public Builder setShield(Integer maxShield) {
            this.maxShield = maxShield;
            return this;
        }

        public Builder setShieldRegeneration(Integer regeration) {
            this.shieldRegeneration = regeration;
            return this;
        }

        public Builder setHealthRegeneration(Integer regeneration) {
            this.healthRegeneration = regeneration;
            return this;
        }

        public Builder setAttack(Integer attack) {
            this.attack = attack;
            return this;
        }

        public Builder setRange(Integer range) {
            this.range = range;
            return this;
        }

        public Builder setBuild(Boolean build) {
            this.canBuild = build;
            return this;
        }

        public Unit build(){
            Unit unit = new Unit();

            unit.unitName = this.unitName;
            unit.maxHealth = this.maxHealth;
            unit.health = unit.maxHealth;
            unit.maxShield = this.maxShield;
            unit.shield = unit.maxShield;
            unit.attack = this.attack;
            unit.range = this.range;
            unit.canBuild = this.canBuild;

            return unit;

        }
    }

    public void heal(Integer healAmount) {

    }

    public void attack(){}

    public void takeDamage(){}

    



}
