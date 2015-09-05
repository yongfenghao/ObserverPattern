package com.hao.design.observer;

import org.junit.Test;

import com.hao.design.observer.ConcretObserver;
import com.hao.design.observer.ConcretSubject;
import com.hao.design.observer.IObserver;
import com.hao.design.observer.ISubject;

public class MainTest {

	@Test
	public void test() {
		ISubject subject = new ConcretSubject();

		IObserver observer1 = new ConcretObserver("obsrever1");
		IObserver observer2 = new ConcretObserver("observer2");

		subject.attach(observer1);
		subject.attach(observer2);
		subject.detaich(observer1);
		subject.notice();

	}

}
