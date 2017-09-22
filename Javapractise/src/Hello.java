
public class Hello implements Myinterface {

	public static void main(String[] args) {
		
		Hello D1=new Hello();
		D1.hello();
	}

	@Override
	public void hello() {
		
		
		System.out.println("interface uses implementation");
		
	}

}
