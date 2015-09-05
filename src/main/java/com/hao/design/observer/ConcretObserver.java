package com.hao.design.observer;

public class ConcretObserver implements IObserver {

	private String name;

	public ConcretObserver(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println(name + " has recived a message!");
	}

}
