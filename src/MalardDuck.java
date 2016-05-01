
public class MalardDuck extends Duck{

	public MalardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("I'm a Malard duck");
		
	}

}
