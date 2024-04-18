package com.zhaoxue.learnspringframwork;

import com.zhaoxue.learnspringframwork.game.WangziGameTest;

public class AppGamingBasic {
	public static void main(String[] args) {
		
		WangziGameTest game = new WangziGameTest();
		System.out.println(game);
		game.up();
		game.down();
	}

}
