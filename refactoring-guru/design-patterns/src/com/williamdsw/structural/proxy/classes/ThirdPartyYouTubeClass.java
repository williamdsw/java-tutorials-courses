package com.williamdsw.structural.proxy.classes;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyYouTubeClass implements IThirdPartyYouTubeLib {

	// FIELDS

	private final String BASE_URL = "http://www.youtube.com";

	// OVERRIDED FUNCTIONS

	@Override
	public Map<String, Video> getPopularVideos() {
		connectToServer(BASE_URL);
		return getVideos();
	}

	@Override
	public Video getVideo(String videoId) {
		connectToServer(BASE_URL + "/" + videoId);
		return getVideoById(videoId);
	}

	// HELPER FUNCTIONS

	private int random(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	private void mockNetworkLatency() {
		int latency = random(5, 100);
		for (int i = 0; i < latency; i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void connectToServer(String url) {
		System.out.println("Connecting to " + url + " ... ");
		mockNetworkLatency();
		System.out.println("Connected!\n");
	}

	private Map<String, Video> getVideos() {
		System.out.println("Downloading popular videos ...");

		mockNetworkLatency();
		Map<String, Video> mapVideos = new HashMap<>();
		mapVideos.put("h8ysad8h7asd", new Video("h8ysad8h7asd", "Shimmy.mp4"));
		mapVideos.put("7b8et217te2e", new Video("7b8et217te2e", "Ghost - Cirice.avi"));
		mapVideos.put("81273h819yas",
				new Video("81273h819yas", "Final Fight 2 - Fret Street Beat-Beat (Sega Genesis Remix).mkv"));
		mapVideos.put("2jhg3j123tu7", new Video("2jhg3j123tu7", "What If We Powered the Planet With Lightning?.mp4"));
		mapVideos.put("92akjhdf7adf", new Video("92akjhdf7adf", "Java Design Patterns.mkv"));

		System.out.println("Done!\n");

		return mapVideos;
	}

	private Video getVideoById(String videoId) {
		System.out.println("Downloading video... ");

		mockNetworkLatency();
		Video video = new Video(videoId, "Some video title");

		System.out.println("Done!\n");

		return video;
	}

}
