package mailDecorator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kimden="Turkay Urkmez";
		String kime="Sisman adam";
		
		IMail standartMail=new GenelMail(kimden,kime);
		IMail imzaliMail = new ImzaDecorator(standartMail, "Türkay Ürkmez");
        IMail sifreliMail = new SifreleDecorator(imzaliMail);
        IMail eposta=new EPostaDecorator(imzaliMail,"turgtgmail");
        IMail mektup =new MektupDecorator(eposta);
      //  sifreliMail.gonder();
       // eposta.gonder();
        mektup.gonder();
	}

}
