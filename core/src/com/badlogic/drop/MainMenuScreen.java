package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

public class MainMenuScreen implements Screen {
    final Drop game;
    OrthographicCamera camera;
    GlyphLayout textLogo, tapAnywhere;

    public MainMenuScreen(final Drop game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        // using GlyphLayout allows us to center the text
        textLogo = new GlyphLayout(game.font100, "Drop");
        tapAnywhere = new GlyphLayout(game.font30,"Tap anywhere to begin");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font100.draw(game.batch, textLogo, 800 / 2 - textLogo.width / 2, 480 / 2 + textLogo.height / 2 + 50);
        game.font30.draw(game.batch, tapAnywhere, 800 / 2 - tapAnywhere.width / 2, 150 + 40);
        game.batch.end();

        if(Gdx.input.isTouched()) {
            game.setScreen(new GameScreen(game));
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}