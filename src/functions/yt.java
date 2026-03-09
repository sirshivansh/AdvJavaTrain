// Create two classes.
//class1 Youtube Account, class2 Youtube Premium

class YouTube
{
	void watchVideo()
	{
		System.out.println("You can watch videos!");
	}

	void changePace()
	{
		System.out.println("You can adjust video speed");
	}

	void searchVideo()
	{
		System.out.println("You can search video");
	}
}

class YouTubePremium extends YouTube
{
	void downloadVideo()
	{
		System.out.println("You can download Videos");
	}

	void hdWatch()
	{
		System.out.println("You can watch videos in 1080p Enhanced Bitrate");
	}
}

class yt
{
	public static void main(String args[])
	{
		YouTubePremium ytp = new YouTubePremium();
		
		ytp.watchVideo();
		ytp.changePace();
		ytp.searchVideo();
		ytp.downloadVideo();
		ytp.hdWatch();
	}
}