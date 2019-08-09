package com.proxy.moveProxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		People people = new People();
		ProxyHandLer handLer = new ProxyHandLer(people);
		Behaviour behaviour = (Behaviour) Proxy.newProxyInstance(Behaviour.class.getClassLoader(), 
				new Class[]{Behaviour.class}, handLer);
		behaviour.findRoom();
	}
}
