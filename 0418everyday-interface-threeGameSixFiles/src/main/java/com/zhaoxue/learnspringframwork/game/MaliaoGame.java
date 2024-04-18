package com.zhaoxue.learnspringframwork.game;

import com.zhaoxue.learnspringframwork.GamingConsole;

public class MaliaoGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("up001");
	}

	@Override
	public void down() {
		System.out.println("down001");
	}
}