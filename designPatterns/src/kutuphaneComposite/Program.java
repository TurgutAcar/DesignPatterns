package kutuphaneComposite;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Katagori kitaplar = new Katagori("Kitap");
		Katagori bilimKurgu=new Katagori("Bilim kurgu");
		Katagori fantastik=new Katagori("Fantastik");
		
		Kitap bilimKurgu1 = new Kitap("Vakif"); 
		Kitap bilimKurgu2 = new Kitap("Kaplan"); 
		
		Kitap fantastik1=new Kitap("Yuzuklerin Efendisi");
        
		kitaplar.Ekle(bilimKurgu);
		kitaplar.Ekle(fantastik);
     	bilimKurgu.Ekle(bilimKurgu1);
		bilimKurgu.Ekle(bilimKurgu2);
		fantastik.Ekle(fantastik1);
		bilimKurgu.Ekle(fantastik);
	//	fantastik.Goster(1);
		bilimKurgu.Goster(1);
		//kitaplar.Goster(1);
	}

}
