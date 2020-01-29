package animal;

public class DuckTestDrive {

	public static void main(String[] args) {
       WildTurkey turkey=new WildTurkey();
       Duck turkeyAdapter = new TurkeyAdapter(turkey);
       
       System.out.println("The Turkey says...");
       turkey.gobble();
       turkey.fly();
       
       System.out.println("The TurkeyAdapter says..");
       testDuck(turkeyAdapter);
	}
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
