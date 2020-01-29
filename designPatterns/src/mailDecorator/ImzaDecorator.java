package mailDecorator;

public class ImzaDecorator extends Decorator {

	private String imza;
	
	
	
	public ImzaDecorator(IMail mail,String imza) {
		super(mail);
		this.imza=imza;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void gonder() {
		super.gonder();
		System.out.println(imza+"imzalandi");

}
}