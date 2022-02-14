package com.williamdsw.structural.proxy.app;

import com.williamdsw.structural.proxy.classes.ThirdPartyYouTubeClass;
import com.williamdsw.structural.proxy.classes.YouTubeDownloader;
import com.williamdsw.structural.proxy.classes.YoutubeCacheProxy;

public class ProxyDemo {

	// HELPER FUNCTIONS

	public static void proxyDemo() {

		YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
		YouTubeDownloader smartDownloader = new YouTubeDownloader(new YoutubeCacheProxy());

		long naive = mockDownloadVideos(naiveDownloader);
		long smart = mockDownloadVideos(smartDownloader);

		System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
	}

	private static long mockDownloadVideos(YouTubeDownloader downloader) {
		long startTime = System.currentTimeMillis();

		downloader.renderPopularVideos();
		downloader.renderPopularVideos();
		downloader.renderVideoPage("h8ysad8h7asd");
		downloader.renderVideoPage("92akjhdf7adf");
		downloader.renderVideoPage("81273h819yas");

		long estimatedTime = (System.currentTimeMillis() - startTime);
		System.out.println("Time elapsed: " + estimatedTime + "ms\n");
		;
		return estimatedTime;
	}

}
