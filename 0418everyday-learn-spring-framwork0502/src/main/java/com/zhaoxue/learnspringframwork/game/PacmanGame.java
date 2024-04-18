package com.zhaoxue.learnspringframwork.game;

import org.springframework.stereotype.Component;

import com.zhaoxue.learnspringframwork.GamingConsole;

@Component
public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("testcontext.getBean");
	}

	@Override
	public void down() {
		System.out.println("test2");
	}

	@Override
	public void left() {
		System.out.println("test3");
	}

	@Override
	public void right() {
		System.out.println("test4");
	}

}
