interface Camera
{
	void takePhoto();
}

interface MusicPlayer
{
	void playMusic();
}

class SmartPhone implements Camera, MusicPlayer
{
	public void takePhoto()
	{
		System.out.println("Photos captured through Smartphone");
	}

	public void playMusic()
	{
		System.out.println("Music is playing on Smartphone");
	}
}

public class interfaceTest
{
	public static void main(String args[])
	{
		SmartPhone sp = new SmartPhone();
		sp.takePhoto();
		sp.playMusic();
	}
}