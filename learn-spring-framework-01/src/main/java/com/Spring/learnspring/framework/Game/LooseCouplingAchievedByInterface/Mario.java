package com.Spring.learnspring.framework.Game.LooseCouplingAchievedByInterface;

public class Mario implements GameConsole {

	
	public void up()
	{
		System.out.println("Jump");
	}
	public void down()
	{
		System.out.println("in to hole");
	}
	public void left()
	{
		System.out.println("going back");
	}
	public void right()
	{
		System.out.println("moving forward");
	}
}


