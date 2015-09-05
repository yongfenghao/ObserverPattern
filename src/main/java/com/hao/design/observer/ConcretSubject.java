package com.hao.design.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcretSubject implements ISubject {

	private List<IObserver> observers = new ArrayList<IObserver>();

	@Override
	public void notice() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}

	@Override
	public void attach(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void detaich(IObserver observer) {
		observers.remove(observer);

	}

}
