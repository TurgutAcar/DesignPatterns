package mailDecorator;

public class Decorator implements IMail {
	private IMail mail;
	
	public Decorator(IMail mail) {
		this.mail = mail;
	}
	
     @Override
	public void gonder() {
		// TODO Auto-generated method stub
    	 mail.gonder();
	}

}
