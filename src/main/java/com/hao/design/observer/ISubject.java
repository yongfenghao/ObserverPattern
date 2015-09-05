package com.hao.design.observer;

public interface ISubject {
	void notice();

	void attach(IObserver observer);

	void detaich(IObserver observer);
}
