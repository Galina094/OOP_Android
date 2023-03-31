package com.mygdx.game.war.Project_OOP.Unit;

import java.util.ArrayList;

import javax.naming.directory.InvalidAttributeIdentifierException;

public abstract class Shooter_Class extends BaseHero {

    // accuracy - меткость;
    
    protected int arrovs;
    protected int accuracy;      

    public Shooter_Class(int hp, int maxHp, int speed, int damage, int defence, String name, int x, int y, int arrovs,
            int accuracy) {
        super(hp, maxHp, speed, damage, defence, name, x, y);
        this.arrovs = arrovs;
        this.accuracy = accuracy;
    }

    @Override
    public String getInfo() {
        return String.format("%s  Arr: %d ", 
                            super.getInfo(), this.arrovs);
    }

    @Override
    public String toString() {
        return String.format("У %s ОСТАЛОСЬ Arrovs: %d", super.getClass().getSimpleName(), this.arrovs);
    }

    // @Override
    // public String toString(){
    //     return "Осталось стрел" + String.valueOf(arrovs);
    // }   


    @Override
    public void step(ArrayList<BaseHero> friendly_team, ArrayList<BaseHero> team2 ) { 
        StopProgram(team2);              
        if (!state.equals("Die") && this.arrovs > 0) {        
            // System.out.println("Can Shoot!");   
            for (BaseHero baseHero : team2) {
                if ((baseHero.name == getDistance(this.position.x, this.position.y, team2))) {                    
                    // System.out.println(this.getClass().getSimpleName() + " Shoot in " + baseHero.getInfo());
                    this.getAttack(baseHero, damage);
                    // System.out.println("=== Было стрел " + String.valueOf(this.arrovs));
                    this.arrovs -- ; 
                    // System.out.println("--- Осталось стрел " + String.valueOf(this.arrovs)); 
                    for (BaseHero baseHero2 : friendly_team) {
                        if (baseHero2.toString().equals("FarmerMan") && baseHero2.state=="Stand") {
                            baseHero2.state = "Empty";
                            this.arrovs++;
                            // System.out.println("+++ Добавили стрел " + String.valueOf(this.arrovs));
                            // System.out.println(baseHero2.name + baseHero2.state);
                            break;                                         
                        }                         
                    }                              
                                                               
                    break;                                        
                }                 
            }            
                   
        }       
        
    }
    
    
    
}
