package com.Spring.learnspring.framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.GameConsole;
import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.GameRunner;
import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.PacMan;
import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.SuperContra;

@Configuration
public class GamingConfiguration {

 @Bean
  public GameConsole game()
  {
	  var game=new PacMan();
	  return game;
  }
 
 @Bean
 public GameRunner gameRunner(GameConsole game)
 {
	  var gameRunner=new GameRunner(game);
	  return gameRunner;
 }

}
