package mailDecorator;

public class SifreleDecorator extends Decorator {

	public SifreleDecorator(IMail mail) {
		super(mail);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void gonder() {
		super.gonder();
		System.out.println("sifrelendi");
	}

}
