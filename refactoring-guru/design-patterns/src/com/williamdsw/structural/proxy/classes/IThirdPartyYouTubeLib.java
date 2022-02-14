package com.williamdsw.structural.proxy.classes;

import java.util.Map;

public interface IThirdPartyYouTubeLib {

	public Map<String, Video> getPopularVideos();

	public Video getVideo(String videoId);

}
