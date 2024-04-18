package com.zhaoxue.learnspringframwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zhaoxue.learnspringframwork.game.GameRunner;

// spring来创建bean,为GameRunner和PacmanGame创建了bean，创建了实例
@Configuration
@ComponentScan("com.zhaoxue.learnspringframwork.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}

	}

}
