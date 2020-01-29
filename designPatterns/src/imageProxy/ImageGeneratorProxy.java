package imageProxy;

import java.util.Timer;

import javax.security.auth.callback.TextInputCallback;

public class ImageGeneratorProxy implements IImageGenerator {
	private ImageGenerator imageGenerator;
	private Timer t;
	private boolean loadRealObject=false;

	private void ShowRealImage()
    {
        imageGenerator = new ImageGenerator();
        imageGenerator.showImage();
        loadRealObject = true;
    }
	
	
	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		if(imageGenerator==null) {

		}
	}

}
