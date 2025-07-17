package spring.service.dice.impl;

import java.util.Random;

import spring.service.dice.Dice;

public class DiceCImpl implements Dice{
	private int value;
	
	public DiceCImpl() {
		
	}
	public DiceCImpl(int value) {
		super();
		this.value = value;
	}
	
	@Override
	public void selectedNumber() {
		value = new Random().nextInt(6) + 1;
		
	}

	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public int getValue() {
		return value;
	}


}
