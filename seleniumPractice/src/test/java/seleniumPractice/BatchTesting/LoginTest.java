package seleniumPractice.BatchTesting;

import org.testng.annotations.Test;

public class LoginTest {

	@Test
	void loginByEmail() {
		System.out.println("loginByEmail");
	}
	
	@Test
	void loginByFacebook() {
		System.out.println("loginByFacebook");
	}
	
	@Test
	void loginByTwitter() {
		System.out.println("loginByTwitter");
	}
}
