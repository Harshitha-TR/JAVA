
public class AnimalsTest {

	public static void main(String args[]) {
		Animals a1 =(Animals) new Cat();
		((Cat) a1).Meow();
		
		Animals a2 = (Animals) new Dog();
		((Dog) a2).Bark();
	}
}
