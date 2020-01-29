package soldierComposite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSoldier extends Soldier {
	private List<Soldier> soldiers=new ArrayList<Soldier>();

	public CompositeSoldier(String name, Rank rank) {
		super(name, rank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addSoldier(Soldier soldier) {
		// TODO Auto-generated method stub
        soldiers.add(soldier);
	}

	@Override
	public void removeSoldier(Soldier soldier) {
		// TODO Auto-generated method stub
       soldiers.remove(soldier);
	}

	@Override
	public void executeSoldier() {
		// TODO Auto-generated method stub
		System.out.println("{0}"+rank+"{1}"+name);
		for(Soldier soldier : soldiers) {
			soldier.executeSoldier();
		}

	}

}
