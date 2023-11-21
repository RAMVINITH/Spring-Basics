package com.Spring.learnspring.framework.Game.TightCoupling;

public class GameRunner {

	Mario mario=new Mario();
	public GameRunner(Mario mario)
	{
		this.mario=mario;
	}
	public void run()
	{
		mario.up();
		mario.down();
		mario.left();
		mario.right();
	}
}
