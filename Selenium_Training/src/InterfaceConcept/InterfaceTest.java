package InterfaceConcept;

public class InterfaceTest implements SeleniumTest{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		InterfaceTest test = new InterfaceTest();
		//SeleniumTest  set = new SeleniumTest();
		test.testOne();
		test.testTwo();
		test.testThree();
	}

	@Override
	public void testOne() {
		// TODO Auto-generated method stub
		System.out.println("testOne");
		
	}

	@Override
	public void testTwo() {
		// TODO Auto-generated method stub
		System.out.println("testTwo");
	}

	@Override
	public void testThree() {
		// TODO Auto-generated method stub
		System.out.println("testThree");
		
	}

}
