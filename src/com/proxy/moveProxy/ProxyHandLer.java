package com.proxy.moveProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandLer implements InvocationHandler{

	private Object realObject;
	
	
	public ProxyHandLer(Object obj) {
		this.realObject = obj;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		if (Behaviour.class.isInstance(realObject))
			object = method.invoke(realObject, args);
		return object;
	}

}
