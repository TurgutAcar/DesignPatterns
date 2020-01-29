package ogrenciObserver;

public class Program {
	public static void main(String[] args) {
	  
	     
	    Ogrenci o = new Ogrenci();
	    o.aboneEkle(new BabaObserver());
	    o.aboneEkle(new AnneObserver());
	    o.aboneEkle(new OgretmenObserver());
	     
	    o.adi = "Gençay";
	    o.soyadi = "Yýldýz";
	    o.memleket = "Artvin";
	    o.sinif = 24;
	    o.dersiAstiMi = true;
	    o.setDersiAstiMi();

}
}