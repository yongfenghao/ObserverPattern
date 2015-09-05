package com.hao.design;

public interface ISubject {
	void notice();

	void attach(IObserver observer);

	void detaich(IObserver observer);
}
