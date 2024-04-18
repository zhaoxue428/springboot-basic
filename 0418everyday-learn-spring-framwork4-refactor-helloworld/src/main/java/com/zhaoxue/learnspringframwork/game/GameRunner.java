package com.zhaoxue.learnspringframwork.game;

import com.zhaoxue.learnspringframwork.GamingConsole;

public class GameRunner {
	// 避免了紧耦合的问题，通过创建GameConsole interface 使GameRunner不需要修改代码

	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
