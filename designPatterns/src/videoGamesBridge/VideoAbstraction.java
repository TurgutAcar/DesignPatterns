package videoGamesBridge;

public  class VideoAbstraction {
		protected IVideoMode mode;
		
		public IVideoMode videoMode;

		

		public void setVideoMode(IVideoMode videoMode) {
			this.videoMode = videoMode;
		}
		public void showScreen() {
			System.out.println(videoMode.getScreen());
		}
		
}
