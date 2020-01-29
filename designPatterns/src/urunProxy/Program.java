package urunProxy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UrunServiceProxy urun=new UrunServiceProxy();
		//urun.urunAdlariniGetir();
		System.out.println(urun.urunAdlariniGetir());
		
		for(int i=0;i<urun.urunAdlariniGetir().size();i++) {
			System.out.println(urun.urunAdlariniGetir().get(i));
		}

	}

}
