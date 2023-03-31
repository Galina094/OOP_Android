package com.mygdx.game.war.Project_OOP.Unit;

public class Magician extends Magical_Class {

    public Magician(String name, int x, int y) {
        super(30, 40, 9,5,12, name, x, y, 10,17);        
    } 

    @Override
    public String getInfo() {
        return String.format("Magician: %s ", 
                                    super.getInfo());
    }

    @Override
    public String toString() {        
        return "Magician";
    }

    @Override
    public String getNAME() {        
        return "Magician";
    }

    
    
}
