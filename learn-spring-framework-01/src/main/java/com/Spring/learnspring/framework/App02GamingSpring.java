package com.Spring.learnspring.framework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.GameConsole;
import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.GameRunner;
import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.PacMan;
import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.SuperContra;

public class App02GamingSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class))
		{
//			context.getBean(GameConsole.class).down();
			context.getBean(GameRunner.class).run();
		} 
		catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		var game=new PacMan();
//		var gameRun=new GameRunner(game);
//		gameRun.run();
		

	}

}
