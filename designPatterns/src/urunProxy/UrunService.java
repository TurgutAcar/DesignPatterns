package urunProxy;

import java.util.ArrayList;
import java.util.List;

public class UrunService implements IUrunService {
	
	@Override
	public List<String> urunAdlariniGetir() {
		
		List<String> urun= new ArrayList<String>();
		urun.add("saat");
		urun.add("g�mlek");
		urun.add("tirbusan");
		return urun;
		//{"Saat","G�mlek","Tirbusan"};
		
	}

}
