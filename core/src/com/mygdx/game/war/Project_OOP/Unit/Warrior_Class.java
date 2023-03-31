package com.mygdx.game.war.Project_OOP.Unit;

import java.util.ArrayList;

public abstract class Warrior_Class extends BaseHero {

    protected int phisicalPower;    
    protected int maxSpeed;      

    public Warrior_Class(int hp, int maxHp, int speed, int damage, int defence, String name, int x, int y,
            int phisicalPower, int maxSpeed) {
        super(hp, maxHp, speed, damage, defence, name, x, y);
        this.phisicalPower = phisicalPower;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getInfo() {
        return String.format("%s, PP: %d ", super.getInfo(), this.phisicalPower);
    }

    @Override
    public void step(ArrayList<BaseHero> friendly_team, ArrayList<BaseHero> team2) {
        StopProgram(team2);
        if (!state.equals("Die") && this.phisicalPower > 0) {   
            BaseHero target = team2.get(0); 
            for (BaseHero baseHero : team2) {
                if ((baseHero.name == getDistance(this.position.x, this.position.y, team2))) {    
                    target = baseHero;}
                }
            if (this.position.getDisNum(target)>=2) {
                this.position.direction(target.position, friendly_team);
            } else {
                this.getAttack(target, this.damage);
                for (BaseHero baseHero2 : friendly_team) {
                    if (baseHero2.toString().equals("Monk") || baseHero2.toString().equals("Magician")  && baseHero2.state=="Stand") {
                        baseHero2.state = "Empty";
                        this.phisicalPower++;                            
                        break;                                         
                    } else {this.phisicalPower--; break;}                        
                } 

            }           
                        
        }           
    }           
        
        
    
    
    

    

}
