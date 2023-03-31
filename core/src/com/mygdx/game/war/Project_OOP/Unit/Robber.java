package com.mygdx.game.war.Project_OOP.Unit;

public class Robber extends Warrior_Class{

    public Robber(String name, int x, int y){
        super(50, 25, 6, 4, 3, name, x, y, 8, 8);
    }

    @Override
    public String getInfo() {        
        return String.format("Robber: %s", 
                                    super.getInfo()); 
    } 

    @Override
    public String getNAME() {        
        return "Robber";
    }
    
}
