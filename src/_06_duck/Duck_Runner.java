package _06_duck;

public class Duck_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Duck duck = new Duck("Seeds", 10);
	duck.quack();
	duck.waddle();
	Monkeys monkey = new Monkeys("Bananas", 8);
	monkey.climb();
	monkey.swing();
	}

}
