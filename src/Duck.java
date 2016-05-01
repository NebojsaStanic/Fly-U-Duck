
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void quackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
	public void perfomFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}

}
