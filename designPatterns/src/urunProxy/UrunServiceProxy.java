package urunProxy;

import java.util.List;

public class UrunServiceProxy implements IUrunService {
	private UrunService urunService=null;
	@Override
	public List<String> urunAdlariniGetir() {
		urunService=new UrunService();
		return urunService.urunAdlariniGetir();
	}

}
