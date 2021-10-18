
public class Outer {
	private int number = 6;
	class Inner{
	Inner(){
		
	}
	int innerNum=20;
	void show() {
		System.out.println(innerNum);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ob = new Outer();
		System.out.println(ob.number);
		Outer.Inner in = ob.new Inner();
		in.show();
	}

}
