package com.williamdsw.structural.proxy.classes;

import java.util.HashMap;
import java.util.Map;

public class YoutubeCacheProxy implements IThirdPartyYouTubeLib {

	// FIELDS

	private IThirdPartyYouTubeLib youtubeService;
	private Map<String, Video> mapCachedPopular = new HashMap<>();
	private Map<String, Video> mapCachedAll = new HashMap<>();

	// CONSTRUCTOR

	public YoutubeCacheProxy() {
		this.youtubeService = new ThirdPartyYouTubeClass();
	}

	// OVERRIDED FUNCTIONS

	@Override
	public Map<String, Video> getPopularVideos() {
		if (mapCachedPopular.isEmpty()) {
			mapCachedPopular = youtubeService.getPopularVideos();
		} else {
			System.out.println("Retrieved list from cache.");
		}

		return mapCachedPopular;
	}

	@Override
	public Video getVideo(String videoId) {
		Video video = mapCachedAll.get(videoId);
		if (video == null) {
			video = youtubeService.getVideo(videoId);
			mapCachedAll.put(videoId, video);
		} else {
			System.out.println(String.format("Retrieved video %s from cache.", videoId));
		}

		return video;
	}

	// HELPER FUNCTIONS

	public void reset() {
		mapCachedPopular.clear();
		mapCachedAll.clear();
	}

}
