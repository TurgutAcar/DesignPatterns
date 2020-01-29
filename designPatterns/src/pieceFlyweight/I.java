package pieceFlyweight;

public class I implements Piece {
	private String label;
	
	
	
	public I() {
		this.label = "I";
	}



	@Override
	public void create(String color, int speed, boolean irreversible) {
		// TODO Auto-generated method stub
 System.out.println("Piece is " + label + ", color: " + color + ", speed: " + speed + ", irreversible: " + irreversible);
	}

}
