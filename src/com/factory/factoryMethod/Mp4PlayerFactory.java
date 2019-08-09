package com.factory.factoryMethod;

public class Mp4PlayerFactory implements VideoPlayerFactory{

	@Override
	public VideoPlayer getVideoPlayer() {
		// TODO Auto-generated method stub
		return new Mp4Player();
	}

}
