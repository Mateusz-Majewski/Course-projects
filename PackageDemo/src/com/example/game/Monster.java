package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private String race;
    private int level;
    private int health;

    public Monster(String name, String race, int level, int health) {
        this.name = name;
        this.race = race;
        this.level = level;
        this.health = health;
    }

    public Monster() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
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

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(name);
        values.add(race);
        values.add(String.valueOf(level));
        values.add(String.valueOf(health));
        return values;
    }

    @Override
    public void read(List<String> values) {
        if(values != null && values.size() > 0) {
            this.name = values.get(0);
            this.race = values.get(1);
            this.level = Integer.parseInt(values.get(2));
            this.health = Integer.parseInt(values.get(3));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
