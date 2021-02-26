package seleniumPractice.testNG;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertPractice {
	
	static SoftAssert softAssert = new SoftAssert();

	@Test
	public static void app()  {
		softAssert.assertTrue(true);  //true
		softAssert.assertEquals("ABC","abc");  //False
		softAssert.assertEquals("ABC","ABC");  //True
		System.out.println("Print success because its soft assert and soft assert can execute rest of "
				+ "the code");
		softAssert.assertAll();
	}

}
