package inheritance.iinterface;

public class Rectangle implements Shape{

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint");
	}

	@Override
	public void calcS() {
		System.out.println("Rectangle --> calcS");
	}

}
