package com.hao.design.observer.jdk;

import org.junit.Test;

public class JdkObserverClient {

	@Test
	public void test() {
		ConfigObserverSubject configSubject = new ConfigObserverSubject();

		ConfigObserver observer1 = new ConfigObserver();
		ConfigObserver observer2 = new ConfigObserver();
		configSubject.addObserver(observer1);
		configSubject.addObserver(observer2);

		configSubject.setConfigvalue("time:500");
	}

}
