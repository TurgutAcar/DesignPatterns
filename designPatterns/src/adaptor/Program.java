package adaptor;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		int tercih;
		Client client = new Client();

		// client.OdenecekMeblayiHesapla(new MalzemeTipineGoreToplamTutariniHesapla());

		client.OdenecekMeblayiHesapla(new Adapter());

	}

}
