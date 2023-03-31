package com.mygdx.game.war.Project_OOP.Unit;

public class Monk extends Magical_Class{
    public Monk(String name, int x, int y) {
        super(12, 20, 5,4,7,name, x, y, 10,12);        
    }

    @Override
    public String getInfo() {
        return String.format("Monk: %s ", 
                                    super.getInfo());
    } 

    @Override
    public String toString() {        
        return "Monk";
    }

    @Override
    public String getNAME() {        
        return "Monk";
    }

    
}
