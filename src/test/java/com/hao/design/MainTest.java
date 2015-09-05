package com.hao.design;

import org.junit.Test;

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
