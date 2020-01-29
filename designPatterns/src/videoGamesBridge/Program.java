package videoGamesBridge;

public class Program {

	public static void main(String[] args) {

		VideoAbstraction video=new VideoRefinedAbstraction();
		video.videoMode=new OpenGLMode();
		video.showScreen();
		
	}

}
