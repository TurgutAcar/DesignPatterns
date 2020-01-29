package ogrenciObserver;

public class Program {
	public static void main(String[] args) {
	  
	     
	    Ogrenci o = new Ogrenci();
	    o.aboneEkle(new BabaObserver());
	    o.aboneEkle(new AnneObserver());
	    o.aboneEkle(new OgretmenObserver());
	     
	    o.adi = "Gen�ay";
	    o.soyadi = "Y�ld�z";
	    o.memleket = "Artvin";
	    o.sinif = 24;
	    o.dersiAstiMi = true;
	    o.setDersiAstiMi();

}
}