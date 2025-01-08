package inheritance.abstractclass;

public class Ex01AbstractClassDemo {
	
	public static void main(String[] args) {
		// anonymous class
		EmailService emailService = new EmailService() {
			
			@Override
			void login() {
				System.out.println("Test Login");	
			}
		};
		
		emailService.login();
	}
	
}