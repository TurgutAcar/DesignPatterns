package bankaProxy;

public class Banka implements IBanka {

	@Override
	public boolean odemeYap(double tutar) {
		// TODO Auto-generated method stub
		if(tutar<100) {
			System.out.println("Odeyeceginiz tutar 100 TL'den az olamaz ->"+(100-tutar));
		}
		else {
			System.out.println("Odeme basariyla gerçeklestirilmistir ->");
			return true;
		}
		return false;
	}

}
