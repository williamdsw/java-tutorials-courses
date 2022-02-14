package com.williamdsw.structural.proxy.classes;

import java.util.Map;

public class YouTubeDownloader {

	// FIELDS

	private IThirdPartyYouTubeLib api;

	// CONSTRUCTOR

	public YouTubeDownloader(IThirdPartyYouTubeLib api) {
		this.api = api;
	}

	// HELPER FUNCTIONS

	public void renderPopularVideos() {
		Map<String, Video> mapPopularVideos = api.getPopularVideos();
		System.out.println("\nMost popular videos:\n");
		mapPopularVideos.forEach((key, value) -> {
			System.out.println(String.format("ID: %1s / Title: %2s", value.getId(), value.getTitle()));
		});
	}

	public void renderVideoPage(String videoId) {
		Video video = api.getVideo(videoId);
		System.out.println("\nVideos's data:\n");
		System.out.println(video.toString());
	}

}
