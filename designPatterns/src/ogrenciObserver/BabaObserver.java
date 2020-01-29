package ogrenciObserver;

public class BabaObserver extends Observer {

	@Override
	public void update() {
		System.out.println("Ogrencinin kactigindan babasinin haberi oldu.");
	}

}
