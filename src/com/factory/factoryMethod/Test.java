package com.factory.factoryMethod;

public class Test {
	public static void main(String[] args) {
		VideoPlayerFactory factory = new AviPlayerFactory();
		VideoPlayer player = factory.getVideoPlayer();
		player.play();
	}
}
