package majewski.mateusz;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(name);
        values.add(characterClass);
        values.add(String.valueOf(level));
        values.add(String.valueOf(health));
        return values;
    }

    @Override
    public void read(List<String> values) {
        if(values != null && values.size() > 0) {
            this.name = values.get(0);
            this.characterClass = values.get(1);
            this.level = Integer.parseInt(values.get(2));
            this.health = Integer.parseInt(values.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }

    private String name;
    private String characterClass;
    private int level;
    private int health;

    public Player(String name, String characterClass, int level, int health) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.health = health;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
