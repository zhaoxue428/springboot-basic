package com.zhaoxue.learnspringframwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zhaoxue.learnspringframwork.game.GameRunner;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		// test this part
		// context（上下文）
		// AnnotationConfigApplicationContext是构造器；
		// GamingConfiguration.class --是一个带有@atioConfiguration注解的java类，通常包含多个@Bean注解的方法

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}

	}

}
