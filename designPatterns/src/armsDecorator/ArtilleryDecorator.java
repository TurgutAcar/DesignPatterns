package armsDecorator;

public class ArtilleryDecorator extends ArmsDecorator {
	
	public ArtilleryDecorator(Arms arms) {
		super(arms);
		
		// TODO Auto-generated constructor stub
	}
	public void defense() {
		System.out.println(super.arms.name+" Savunma Modu");
	}
	public void easy() {
		System.out.println(super.arms.name+" Atýs Serbest Modu");
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		super.fire();
	}

}
