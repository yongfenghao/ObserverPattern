package com.hao.design.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ConfigObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("push pattern: recive config changed notice:" + arg);
		if (o != null)
			System.out.println("pull pattern: recive confit changed notice:" + ((ConfigObserverSubject) o).getConfigvalue());
	}

}
