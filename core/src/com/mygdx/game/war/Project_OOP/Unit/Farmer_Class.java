package com.mygdx.game.war.Project_OOP.Unit;

import java.util.ArrayList;

public abstract class Farmer_Class extends BaseHero {

    protected int nutrition;
    protected int goodness;     

    public Farmer_Class(int hp, int maxHp, int speed, int damage, int defence, String name, int x, int y, int nutrition,
            int goodness) {
        super(hp, maxHp, speed, damage, defence, name, x, y);
        this.nutrition = nutrition;
        this.goodness = goodness;
    }

    public String getInfo() {
        return String.format("%s ", super.getInfo());
    }

    @Override
    public String toString() {        
        return "FarmerMan";
    }

    @Override
    public void step(ArrayList<BaseHero> friendly_team, ArrayList<BaseHero> team2) {
        if( !this.state.equals("Die")){
            this.state = "Stand";
        }        
    }

    
}
