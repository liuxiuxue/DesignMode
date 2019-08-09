package com.factory.simpleFactory;

public class VideoPlayerFactory {

	public static VideoPlayer getVideoPlayer(String type){
		if("mp4".equals(type))
			return new Mp4Player();
		if("avi".equals(type))
			return new AviPlayer();
		if("swf".equals(type))
			return new SwfPlayer();
		return null;
	}
}
