package com.mygdx.game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import com.mygdx.game.war.Project_OOP.ConsoleView;
import com.mygdx.game.war.Project_OOP.Unit.*;
public class Program {

    public static final int UNIT = 10;
    public static ArrayList<BaseHero> team1;
    public static ArrayList<BaseHero> team2;
    public static ArrayList<BaseHero> joinTeam;

    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);
        init();

        while (true){

            ConsoleView.view();
            sc.nextLine();
            step();

        }
    }
    private static String getName(){        
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
    public static void init(){

        team1 = new ArrayList<>();
        team2 = new ArrayList<>();
        joinTeam = new ArrayList<>();        

        for (int i = UNIT; i < 0; i--) {
            switch (new Random().nextInt(7)) {
                case 0:
                    team1.add(new FarmerMan(getName(), 1, i));
                    break;
                case 1:
                    team1.add(new Magician(getName(), 1, i));
                    break;
                case 2:
                    team1.add(new Monk(getName(), 1, i));
                    break;
                case 3:
                    team1.add(new Pikeman(getName(), 1, i));
                    break;
                case 4:
                    team1.add(new Robber(getName(), 1, i));
                    break;
                case 5:
                    team1.add(new Sniper(getName(), 1, i));
                    break;
                default:
                    team1.add(new XBowMan(getName(), 1, i));
                    break;
            }

            switch (new Random().nextInt(7)) {
                case 0:
                    team2.add(new FarmerMan(getName(), 10, i+1));                    
                    break;
                case 1:
                    team2.add(new Magician(getName(), 10, i+1));
                    break;
                case 2:
                    team2.add(new Monk(getName(), 10, i+1));
                    break;
                case 3:
                    team2.add(new Pikeman(getName(), 10, i+1));
                    break;
                case 4:
                    team2.add(new Robber(getName(), 10, i+1));
                    break;
                case 5:
                    team2.add(new Sniper(getName(), 10, i+1));
                    break;
                default:
                    team2.add(new XBowMan(getName(), 10, i+1));
                    break;
            }
            
        } 
        team1.forEach(BaseHero::getNAME);
        team2.forEach(BaseHero::getNAME);

    }

    public static void step(){

        joinTeam.addAll(team1);
        joinTeam.addAll(team2);

        joinTeam.sort(new Comparator<BaseHero>() {

            public int compare (BaseHero h1, BaseHero h2){
                if (h1.getSpeed() == h2.getSpeed())
                    return 0;
                else if (h1.getSpeed() > h2.getSpeed())
                    return 1;
                else return -1;

            }
        });
        
        for (BaseHero unit : joinTeam) {
            if (team1.contains(unit)){
                unit.step(team1, team2);
            } else {unit.step(team2, team1); }
            
        }

    }

}