package com.Spring.learnspring.framework.Game.TightCoupling;

public class AppGaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var mario=new Mario();
		var gameRun=new GameRunner(mario);
		gameRun.run();

	}

}
