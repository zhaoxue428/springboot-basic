package com.zhaoxue.learnspringframwork.game;

public class GameRunner {

	// 声明了game对象
	private WangziGameTest game;

	// 易错：如果要用到GameRunner类的run方法（含有game对象），要先初始化game对象
	public GameRunner(WangziGameTest game) {
		this.game = game;
	};

	public void run() {
		System.out.println("Running game:" + game);
		game.up();
		game.down();
	}

}
