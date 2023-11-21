package com.Spring.learnspring.framework;

import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.GameRunner;
import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.PacMan;
import com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface.SuperContra;

public class App01GamingByInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game=new PacMan();
		var gameRun=new GameRunner(game);
		gameRun.run();

	}

}
