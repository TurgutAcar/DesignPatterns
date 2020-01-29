package siparis;

public class Adapter implements Target {
    Adaptee adaptee=new Adaptee();

	@Override
	public void siparis() {
           adaptee.kemenceSiparisi();
        
	}

}
