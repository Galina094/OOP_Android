package com.mygdx.game.war.Project_OOP.Unit;

import java.util.ArrayList;

public interface UnitInterface {

    void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);

    String getInfo();    
    
}
