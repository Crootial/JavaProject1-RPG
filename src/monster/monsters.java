package monster;

public class monsters extends monsterStats{
    // Attributes
    public String name;

    // Constructor
    public monsters(String name, int level, Double health, Double strength, Double speed, Double evasive) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.evasive = evasive;
    }
}


