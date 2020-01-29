package mailDecorator;

public class EPostaDecorator extends Decorator {
    private String adres;
	public EPostaDecorator(IMail mail ,String adres) {
		super(mail);
		this.adres=adres;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void gonder() {
		super.gonder();
		System.out.println(adres);

}
}