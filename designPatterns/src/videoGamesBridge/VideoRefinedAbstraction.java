package videoGamesBridge;

public class VideoRefinedAbstraction extends VideoAbstraction {
	@Override
	public void showScreen() {
		System.out.println(videoMode.getScreen());
		super.showScreen();
		
	}

}
