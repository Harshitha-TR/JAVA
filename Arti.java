package Inheritane;

public interface Arti {
	int duration=6;
	void canShoot();
	default void repair() {
		System.out.println("Repair for Artillery");
	}

}
