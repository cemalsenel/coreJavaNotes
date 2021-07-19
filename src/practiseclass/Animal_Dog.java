package practiseclass;

public class Animal_Dog extends Animal{
	
	int age = 18;
	int height = 6;

	@Override
	public void sound() {
		System.out.println("Dogs bark");
	}

	@Override
	public int add(int a, int b) {
		
		System.out.println(super.age);
		System.out.println(this.age);
		return a+b;
	}

	@Override
	public Integer multiply(int a, int b) {
		return 7*8;
	}

	@Override
	public Animal create() {
		return new Animal_Dog();
	}
	

}
