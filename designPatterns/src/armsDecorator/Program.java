package armsDecorator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bileþen örneklenir
        Artillery azman = new Artillery(125, 40, "Fýrtýna A1");
        azman.fire();

        // Decorator nesnesi örneklenir
        ArtilleryDecorator  azmanDekorator= new ArtilleryDecorator(azman);
        // Decorator nesnesi üzerinden o anki asýl Component için(Artillery sýnýfý) ek fonksiyonellikler çaðýrýlýr.
        azmanDekorator.defense();
        azmanDekorator.fire();
        azmanDekorator.easy();
        azmanDekorator.fire();
	}

}
