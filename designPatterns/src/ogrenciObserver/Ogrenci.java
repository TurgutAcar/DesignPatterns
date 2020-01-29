package ogrenciObserver;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci {
	public String adi;
	public String soyadi;
	public String memleket;
	public int sinif;
	public boolean dersiAstiMi;
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getMemleket() {
		return memleket;
	}
	public void setMemleket(String memleket) {
		this.memleket = memleket;
	}
	public int getSinif() {
		return sinif;
	}
	public void setSinif(int sinif) {
		this.sinif = sinif;
	}
	public boolean isDersiAstiMi() {
		return dersiAstiMi;
	}
	public void setDersiAstiMi() {
		if(true){
			Notify();
			dersiAstiMi=true;
		}
	}
	
	private List<Observer> gozlemciler= new ArrayList<Observer>();
	public Ogrenci() {
		this.gozlemciler=new ArrayList<Observer>();
		
		
	}
	public void aboneEkle(Observer observer) {
	gozlemciler.add(observer);	
	}
	public void aboneCikar(Observer observer) {
		gozlemciler.remove(observer);	
		}
	public void Notify() {
		for(Observer  observer : gozlemciler ) {
			observer.update();
		}
	}
}
