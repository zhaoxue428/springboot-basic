package com.zhaoxue.learnspringframwork.game;

import com.zhaoxue.learnspringframwork.GamingConsole;

public class WangziGameTest implements GamingConsole {
	@Override
	public void up() {
		System.out.println("up00");
	}

	@Override
	public void down() {
		System.out.println("down001");
	}
}