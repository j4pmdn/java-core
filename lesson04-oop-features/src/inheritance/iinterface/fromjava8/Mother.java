package inheritance.iinterface.fromjava8;

public interface Mother {

	void playBadminton();
	
	default void coding() {
		System.out.println("Father --> coding database");
	}
	
	default void cooking() {
		System.out.println("Mother --> cooking good");
	}
	
}
