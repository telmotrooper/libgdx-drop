package com.badlogic.drop.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.drop.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Drop";
		config.addIcon("images/droplet_icon.png", Files.FileType.Internal);
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Drop(), config);
	}
}
