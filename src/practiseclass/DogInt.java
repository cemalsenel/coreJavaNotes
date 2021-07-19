package practiseclass;

public class DogInt implements AnimalInterface, MammalsInterface {

	public static void main(String[] args) {
		
		

	}

	@Override
	public void eat() {
		System.out.println("Dogs eat");
		
	}

	@Override
	public void sound() {
		System.out.println("Dogs bark");
		
	}

	@Override
	public void move() {
		System.out.println("Dogs run fast");
		
	}

	@Override
	public void givingBirth() {
		System.out.println("Dogs give birth");
		
	}

}
