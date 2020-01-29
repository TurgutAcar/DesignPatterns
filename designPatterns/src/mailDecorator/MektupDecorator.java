package mailDecorator;

public class MektupDecorator extends Decorator {

	public MektupDecorator(IMail mail) {
		super(mail);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void gonder() {
		super.gonder();
		System.out.println("mektup yollandi.");
	}

}
