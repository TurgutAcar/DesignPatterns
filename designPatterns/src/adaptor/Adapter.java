package adaptor;

public class Adapter implements ITutarHesaplayici {
	private Adaptee adaptee;
	
	
	public Adapter() {
		adaptee = new Adaptee();
	}


	@Override
	public double Hesapla(double fiyat, double adet) {
		return adaptee.IskontaliTutariHesapla(fiyat, adet);
	}

}
