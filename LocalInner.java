
public class LocalInner {
	private int number=47;
	
	void show() {
		class Local{
			void show1() {
				System.out.println("Hello!!");
			}
		}
		Local l = new Local();
		l.show1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner li = new LocalInner();
		li.show();
	}

}
