package com.proxy.stirlessProxy;

public class RoomProxy implements Behaviour{

	private People people;
	
	
	public RoomProxy(People people) {
		this.people = people;
	}

	@Override
	public void findRoom() {
		System.err.println("Room Proxy People");
		people.findRoom();
	}

}
