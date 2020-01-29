package armsDecorator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bile�en �rneklenir
        Artillery azman = new Artillery(125, 40, "F�rt�na A1");
        azman.fire();

        // Decorator nesnesi �rneklenir
        ArtilleryDecorator  azmanDekorator= new ArtilleryDecorator(azman);
        // Decorator nesnesi �zerinden o anki as�l Component i�in(Artillery s�n�f�) ek fonksiyonellikler �a��r�l�r.
        azmanDekorator.defense();
        azmanDekorator.fire();
        azmanDekorator.easy();
        azmanDekorator.fire();
	}

}
