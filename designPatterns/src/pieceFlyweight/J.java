package pieceFlyweight;

public class J implements Piece {
	private String label;
	
	
	public J() {
		this.label = "J";
	}


	@Override
	public void create(String color, int speed, boolean irreversible) {
		// TODO Auto-generated method stub
		 System.out.println("Piece is " + label + ", color: " + color + ", speed: " + speed + ", irreversible: " + irreversible);

		

	}

}
