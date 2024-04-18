package com.zhaoxue.learnspringframwork;

import com.zhaoxue.learnspringframwork.game.GameRunner;
import com.zhaoxue.learnspringframwork.game.WangziGameTest;

public class AppGamingBasic {
	public static void main(String[] args) {

		var game = new WangziGameTest();
		var gameRunner = new GameRunner(game);

		gameRunner.run();
	}
}
