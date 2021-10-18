package Inheritane;

public interface Floatable {
	default void canFly() {
		System.out.println("Can fly");
	}
}
