package Interface;

class Phone{
	public void call() {
		System.out.println("Please Pick Up the Phone");
		
	}
	

	public void sms() {
		System.out.println("You have 1 new SMS");
	}
}
	interface Spotify{
		void play();
		void pause();
	}
	
	
	interface Camera{
		void click();
		void record();
	}




 class Android extends Phone implements Spotify,Camera{

	public void videoCall() {
		System.out.println("Android Whatsapp Video Call");
	}
	public void click() {
		System.out.println("Android Click a Pic");
	}
	public void record() {
		System.out.println("Android records a video");
	}
	public void play () {
		System.out.println("Android playing song");
	}
	public void pause() {
		System.out.println("Android Pauses a Song");
	}
 }
	
public class Real_Life_Example{
	
	public static void main(String[] args) {
		
		Android a = new Android();
		
		a.videoCall();
		a.click();
		a.play();
		a.pause();
		
	}
}
	


