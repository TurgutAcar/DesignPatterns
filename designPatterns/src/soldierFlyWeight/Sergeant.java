package soldierFlyWeight;

public class Sergeant extends Soldier {
		public Sergeant() {
			unitName = "SWAT";
            guns = "Sword";
            health = "Good";
		}
	@Override
	public void MoveTo(int x, int y) {
		// TODO Auto-generated method stub
		X=x;
		Y=y;
		System.out.println("Cavus "+X+":"+Y+" noktasina hareket etti");

	}

}
