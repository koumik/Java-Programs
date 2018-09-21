abstract class Player
{
	public abstract void play();
	public abstract void pause();
	public abstract void stop();
}
class genericplayer extends Player
{
	public void play()
	{
		System.out.println("play .avi file");
		System.out.println("play .dat file");
	}
	public void pause()
	{
		System.out.println("pause .avi file");
		System.out.println("pause .dat file");
	}
	public void stop()
	{
		System.out.println("stop .avi file");
		System.out.println("stop .dat file");

	}
}
class DVDplayer extends genericplayer
{
	public void play()
	{
		System.out.println("play .avi file");
		System.out.println("play .dat file");
		System.out.println("play .mpg file");
	}
	public void pause()
	{
		System.out.println("pause .avi file");
		System.out.println("pause .dat file");
		System.out.println("pause .mpg file");
	}
	public void stop()
	{
		System.out.println("stop .avi file");
		System.out.println("stop .dat file");
		System.out.println("stop .mpg file");
	}	
}
class video
{
	public static void perform_operation(Player p)
	{
		p.play();
		p.pause();
		p.stop();
	}
}
class player
{
	public static void main(String[] args) 
	{
		genericplayer gp=new genericplayer();
		DVDplayer dp=new DVDplayer();
		video.perform_operation(gp);
		video.perform_operation(dp);
	}
}