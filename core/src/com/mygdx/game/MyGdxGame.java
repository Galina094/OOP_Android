package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.war.Project_OOP.Unit.BaseHero;

import java.util.ArrayList;
import java.util.Random;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture fon, farmerMan, magician, monk, pikeman, robber, sniper, xBowMan;
	Music music;

	public static final int UNIT = 10;
	public static ArrayList<BaseHero> team1;
	public static ArrayList<BaseHero> team2;
	public static ArrayList<BaseHero> joinTeam;
	public static int step = 0;
	private static  float dx,dy;

	@Override
	public void create () {
		batch = new SpriteBatch();
		fon = new Texture("fons/"+String.valueOf(new Random().nextInt(2)) + ".png");
		music = Gdx.audio.newMusic(
				Gdx.files.internal("music/"+String.valueOf(new Random().nextInt(4)) + ".mp3"));
		music.setVolume(.125f);
		music.setLooping(true);
		music.play();
		Program.init();

		int my = 0;
		xBowMan = new Texture("units/XBowMan.jpg");
		my = xBowMan.getHeight();
		sniper = new Texture("units/Sniper.jpg");
		if (my < sniper.getHeight()) my = sniper.getHeight();
		robber = new Texture("units/Robber.jpg");
		if (my < robber.getHeight()) my = robber.getHeight();
		pikeman = new Texture("units/Pikeman.jpg");
		if (my < pikeman.getHeight()) my = pikeman.getHeight();
		monk = new Texture("units/Monk.jpg");
		if (my < monk.getHeight()) my = monk.getHeight();
		magician = new Texture("units/Magician.jpg");
		if (my < magician.getHeight()) my = magician.getHeight();
		farmerMan = new Texture("units/FarmerMan.jpg");
		if (my < farmerMan.getHeight()) my = farmerMan.getHeight();

		dx =dy= Gdx.graphics.getHeight()/12;
	}

	@Override
	public void render () {
		if (step == 0) Gdx.graphics.setTitle("First step"); else Gdx.graphics.setTitle("Step №" + step);

		batch.begin();
		batch.draw(fon, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());


		Program.team1.forEach(n -> {
			switch (n.getInfo()){
				case "FarmerMan": batch.draw(farmerMan, n.getPositionX()*dx, n.getPositionY()*dy); break;
				case "Magician": batch.draw(magician, n.getPositionX()*dx, n.getPositionY()*dy); break;
				case "Pikeman": batch.draw(pikeman, n.getPositionX()*dx, n.getPositionY()*dy); break;
				case "XBowMan": batch.draw(xBowMan, n.getPositionX()*dx, n.getPositionY()*dy); break;
			}
		});

		Program.team2.forEach(n -> {
			switch (n.getInfo()){
				case "FarmerMan": batch.draw(farmerMan, n.getPositionX()*dx, n.getPositionY()*dy); break;
				case "Monk": batch.draw(monk, n.getPositionX()*dx, n.getPositionY()*dy); break;
				case "Robber": batch.draw(robber, n.getPositionX()*dx, n.getPositionY()*dy); break;
				case "Sniper": batch.draw(sniper, n.getPositionX()*dx, n.getPositionY()*dy); break;
			}
		});


		batch.end();

		if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {
			step++;
			Program.step();
		}
	}

	@Override
	public void dispose () {
		batch.dispose();
		fon.dispose();
	}
}
