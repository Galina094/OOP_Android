package com.mygdx.game.war.Project_OOP.Unit;

public class FarmerMan extends Farmer_Class{

    public FarmerMan(String name, int x, int y) {
        super(3, 50, 3, 1, 1, name, x, y, 10, 5);
    }    

    @Override
    public String getNAME() {        
        return "FarmerMan";
    }

    @Override
    public String getInfo() {
        return String.format("FarmerMan: %s ", 
                                    super.getInfo());
    }
    
}
