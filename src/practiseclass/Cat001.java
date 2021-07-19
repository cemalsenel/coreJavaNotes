package practiseclass;

public class Cat001 extends Animal001 {
	int age = 4;
	int height = 2;
	
	@Override
	public void sound() {
		System.out.println("Cats meow");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("Cats drink milk");
		System.out.println(super.add());
	}
	@Override
	public int add() {
		System.out.println(super.age);
		System.out.println(this.age);
		return 7+5;
		//we can not use super."methodName" after "return" type
	}
	@Override
	public Integer multiply() {
		return 9*7;
	}
	@Override
	public Cat001 create() {
		return new Cat001();
	}
	

}
