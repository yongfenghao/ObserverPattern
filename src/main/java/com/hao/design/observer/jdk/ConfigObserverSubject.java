package com.hao.design.observer.jdk;

import java.util.Observable;

public class ConfigObserverSubject extends Observable {
	private String configvalue;

	public String getConfigvalue() {
		return configvalue;
	}

	public void setConfigvalue(String configvalue) {
		this.configvalue = configvalue;

		this.setChanged();
		// 拉模型，会把整个对象传递过去
		// this.notifyObservers();

		// 推模型，仅传递需要推送的对象
		this.notifyObservers(configvalue);
	}

}
