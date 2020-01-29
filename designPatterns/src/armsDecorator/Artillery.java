package armsDecorator;

public class Artillery extends Arms {
	protected double barrel;
	protected  double range;
		

		public Artillery(double barrel, double range,String name) {
		this.barrel = barrel;
		this.range = range;
		this.name=name;
	}


		@Override
		public void fire() {
			// TODO Auto-generated method stub
			System.out.println(name+" sinifindan olan topcu "+barrel+" mm namlusundan "+range+" mesafeye atesleme yapti.");
			
		}
		
		
	

}
