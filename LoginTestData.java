package homeassignment;

public class LoginTestData extends TestData {
	public void enterUsername() {
		// TODO Auto-generated method stub
        System.out.println("Username entered");
	}
	public void enterPassword() {
		 System.out.println("Password entered");
		
}
	public static void main(String[] args) {
		LoginTestData obj=new LoginTestData();
		obj.enterCredentials();
		obj.enterUsername();
		obj.enterPassword();
		obj.navigateToHomePage();
		
	}
}
