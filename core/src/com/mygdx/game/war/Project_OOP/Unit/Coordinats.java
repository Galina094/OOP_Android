package com.mygdx.game.war.Project_OOP.Unit;

import java.lang.annotation.Target;
import java.util.ArrayList;

import javax.sound.sampled.BooleanControl;
import javax.swing.text.Position;

public class Coordinats {
    protected int x,y;    

    public Coordinats(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Coordinats coordinats){
        if(coordinats.x == this.x && coordinats.y == this.y ){return true;}
        else return false;        
    }

    public double getDisNum(BaseHero unit){
        return Math.sqrt(Math.pow(x - unit.position.x, 2) + Math.pow(y - unit.position.y,2));
    }

    public void direction(Coordinats position, ArrayList<BaseHero> friends){
        boolean[] temp = chekPos(friends);
        float dx = Math.abs(this.x - position.x);
        float dy = Math.abs(this.y - position.y);
        if (dx>dy){
            if (this.x < position.x ) {
                this.x +=1;
            }
            else {this.x-=1;}
        }
        else {
            if (this.y < position.y) {
                this.y +=1;
            }
            else {this.y-=1;}

        }        
        
    }

    public boolean[] chekPos(ArrayList<BaseHero> friends) {
        boolean[] temp = new boolean[4];
        for (BaseHero u: friends){
            if ((u.position.x == this.x+1) & (u.position.y == this.y)) temp[0] = true;
            if ((u.position.x == this.x-1) & (u.position.y == this.y)) temp[1] = true;
            if ((u.position.x == this.x) & (u.position.y == this.y+1)) temp[2] = true;
            if ((u.position.x == this.x) & (u.position.y == this.y-1)) temp[3] = true;
        }
        return temp;
    }

    



    

    

    



    
}
