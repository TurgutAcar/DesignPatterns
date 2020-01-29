package mailDecorator;

public class GenelMail implements IMail {

	private String kimden;
	private String kime;
	
	
	
	public GenelMail(String kimden, String kime) {
		this.kimden = kimden;
		this.kime = kime;
	}



	@Override
	public void gonder() {
		// TODO Auto-generated method stub
		System.out.println("Mail"+ kimden+" kisisinden" +kime+" kisisine gidiyor");
	}

}
