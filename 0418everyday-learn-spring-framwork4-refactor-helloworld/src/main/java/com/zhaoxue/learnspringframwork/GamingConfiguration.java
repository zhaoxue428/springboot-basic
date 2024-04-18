package com.zhaoxue.learnspringframwork;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhaoxue.learnspringframwork.game.GameRunner;
import com.zhaoxue.learnspringframwork.game.PacmanGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}

