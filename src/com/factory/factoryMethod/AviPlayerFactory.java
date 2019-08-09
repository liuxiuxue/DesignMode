package com.factory.factoryMethod;

public class AviPlayerFactory implements VideoPlayerFactory{

	@Override
	public VideoPlayer getVideoPlayer() {
		// TODO Auto-generated method stub
		return new AviPlayer();
	}

}
