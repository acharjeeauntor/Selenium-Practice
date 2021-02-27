package seleniumPractice.testNG;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


//@Listeners(seleniumPractice.testNG.CustomListeners.class)
public class ListenerTest {
	
	@Test
	void Test1() {
		System.out.println("This is test 1");
		Assert.assertEquals("A", "A");
	}
	
	@Test
	void Test2() {
		System.out.println("This is test 2");
		Assert.assertEquals("A", "B");
	}
	@Test
	void Test3() {
		System.out.println("This is test 3");
		throw new SkipException("This is Skip Exception...");
	}
	

}
