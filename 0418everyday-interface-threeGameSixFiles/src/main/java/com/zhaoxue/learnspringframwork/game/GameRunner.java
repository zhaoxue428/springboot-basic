package com.zhaoxue.learnspringframwork.game;

import com.zhaoxue.learnspringframwork.GamingConsole;

public class GameRunner {

	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running:" + game);
		game.up();
		game.down();
	}
}