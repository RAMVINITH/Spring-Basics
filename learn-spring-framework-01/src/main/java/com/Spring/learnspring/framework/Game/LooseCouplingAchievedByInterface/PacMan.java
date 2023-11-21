package com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface;

public class PacMan implements GameConsole {

	
	public void up()
	{
		System.out.println("Up");
	}
	public void down()
	{
		System.out.println("Down");
	}
	public void left()
	{
		System.out.println("left");
	}
	public void right()
	{
		System.out.println("right");
	}
}


