package com.mygdx.game.war.Project_OOP.Unit;

import java.util.ArrayList;

public abstract class Magical_Class extends BaseHero {
    
    protected int mana;
    protected int magicPower;       

    public Magical_Class(int hp, int maxHp, int speed, int damage, int defence, String name, int x, int y, int mana,
            int magicPower) {
        super(hp, maxHp, speed, damage, defence, name, x, y);
        this.mana = mana;
        this.magicPower = magicPower;
    }

    // @Override
    // public String getInfo() {
    //     return String.format("%s  Mana: %d  MagicPower: %d", 
    //                         super.getInfo(), this.mana, this.magicPower);
    // }    

    // @Override
    // public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        
    // }
}
