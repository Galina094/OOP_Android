package com.mygdx.game.war.Project_OOP.Unit;

import java.util.ArrayList;

public class Sniper extends Shooter_Class {

    public Sniper(String name, int x, int y) {
        super(15, 20, 9,10,10, name, x, y, 32,3);
    }  

    @Override
    public String getInfo() {
        return String.format("Sniper: %s ", 
                                    super.getInfo());
    }

    @Override
    public void step(ArrayList<BaseHero> friendly_team, ArrayList<BaseHero> team2) {
        super.step(friendly_team, team2);
        // System.out.println("Sniper's shoot!!!");
    }

    @Override
    public String toString() {        
        return "Sniper";
    }

    @Override
    public String getNAME() {        
        return "Sniper";
    }

       
}
