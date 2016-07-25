package com.badlogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public class Drop extends Game {
	public SpriteBatch batch;
	public BitmapFont font20, font30, font100;
	private FreeTypeFontGenerator generator;
	private FreeTypeFontParameter parameter;

	public void create() {
		batch = new SpriteBatch();

		generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/Jellee-Roman.ttf"));
		parameter = new FreeTypeFontParameter();

		parameter.size = 20;
		font20 = generator.generateFont(parameter);

		parameter.size = 30;
		font30 = generator.generateFont(parameter);

		parameter.size = 100;
		font100 = generator.generateFont(parameter);

		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		// required to render the screen specified inside create()
		super.render();
	}

	public void dispose() {
		batch.dispose();
		generator.dispose();
		font20.dispose();
		font30.dispose();
	}
}