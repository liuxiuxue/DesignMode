package com.proxy.stirlessProxy;

public class ProxyTest {
	public static void main(String[] args) {
		People people = new People();
		RoomProxy proxy = new RoomProxy(people);
		proxy.findRoom();
	}
}
