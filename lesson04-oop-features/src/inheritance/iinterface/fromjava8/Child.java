package inheritance.iinterface.fromjava8;

public class Child implements Father, Mother{

	@Override
	// Mother: abstract
	public void playBadminton() {
		
	}

	@Override
	// Father: abstract
	public void running() {
		
	}

	@Override
	public void coding() {
		System.out.println("Frontend");
	}
	
	// functional interface
	
	// lambda expression
	
	// strategy pattern

}