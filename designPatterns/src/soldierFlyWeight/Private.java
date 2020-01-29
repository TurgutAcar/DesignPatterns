package soldierFlyWeight;

public class Private extends Soldier {

	public Private() {
		unitName="SWAT";
		guns="Machine Gun";
		health="Good";
	}
	
	
	
	@Override
	public void MoveTo(int x, int y) {
		// TODO Auto-generated method stub
		
		X=x;
		Y=y;
		System.out.println("Er "+X+":"+Y+" noktasina hareket etti");

	}

}
