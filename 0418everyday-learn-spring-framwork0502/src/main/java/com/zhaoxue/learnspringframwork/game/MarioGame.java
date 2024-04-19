package com.zhaoxue.learnspringframwork.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.zhaoxue.learnspringframwork.GamingConsole;

@Component
@Primary
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Go into a hole");
	}

	@Override
	public void left() {
		System.out.println("Go back");
	}

	@Override
	public void right() {
		System.out.println("Accelerate");
	}

}
