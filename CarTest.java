package Inheritane;

public class CarTest implements Arti,Floatable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmoredCar ar = new ArmoredCar();
		ar.atomaticStart();
		ar.canFloat();
		ar.canShoot();

	}

	@Override
	public void canShoot() {
		// TODO Auto-generated method stub
		
	}
}
