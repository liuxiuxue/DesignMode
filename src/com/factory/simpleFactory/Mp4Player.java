package com.factory.simpleFactory;

public class Mp4Player implements VideoPlayer {

	@Override
	public void play() {
		System.err.println("mp4 play");
	}

}
