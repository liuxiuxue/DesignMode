package com.factory.simpleFactory;

public class TestFactory {
	public static void main(String[] args) {
		VideoPlayer player = VideoPlayerFactory.getVideoPlayer("swf");
		player.play();
	}
}
