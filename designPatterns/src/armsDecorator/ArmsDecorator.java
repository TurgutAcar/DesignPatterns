package armsDecorator;

public abstract class ArmsDecorator {
	protected Arms arms;

	public ArmsDecorator(Arms arms) {
		this.arms = arms;
	}
	public void fire() {
		// TODO Auto-generated method stub
       		if(arms!=null) {
       			arms.fire();
       		}
	}
	

}
