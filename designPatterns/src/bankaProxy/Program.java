package bankaProxy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IBanka banka = new ProxyBanka("turgutacar","arroyo");
		banka.odemeYap(250);

	}

}
