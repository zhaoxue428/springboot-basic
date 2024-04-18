package com.zhaoxue.learnspringframwork;

import com.zhaoxue.learnspringframwork.game.GameRunner;
import com.zhaoxue.learnspringframwork.game.PacmanGame;

public class AppGameBasicJava {

	public static void main(String[] args) {

		// 想要完三个游戏；用接口实现了不修改GameRunner，只修改该文件的创建类的实例就可以实现目的
		// 使用interface引入松耦合

//		var game = new MarioGame();
		var game = new PacmanGame();
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);

		gameRunner.run();

	}

}
