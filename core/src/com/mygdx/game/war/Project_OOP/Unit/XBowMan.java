package com.mygdx.game.war.Project_OOP.Unit;

import java.util.ArrayList;

public class XBowMan extends Shooter_Class {

    public XBowMan(String name, int x, int y) {
        super(10, 15, 4,3,3, name, x, y, 30,5);
    }    

    @Override
    public String getInfo() {
        return String.format("XBowMan: %s ", 
                                    super.getInfo());
    } 
    
    @Override
    public void step(ArrayList<BaseHero> friendly_team, ArrayList<BaseHero> team2) {
        super.step(friendly_team, team2);
        // System.out.println("XBowMan's shoot!!!");
    }
    
    @Override
    public String getNAME() {        
        return "XBowMan";
    }
    
}
