package seleniumPractice.testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependencyAndAlwaysRun {

	@Test
	void startCar() {
		System.out.println("Car Start");
		//Assert.fail();
	}

	@Test(dependsOnMethods= {"startCar"})
	void driveCar() {
		System.out.println("Car Drive");
	}

	@Test(dependsOnMethods= {"driveCar"})
	void stopCar() {
		System.out.println("Car Stop");
	}

	@Test(dependsOnMethods= {"driveCar","stopCar"},alwaysRun=true)
	void parkCar() {
		System.out.println("Car Park");
	}

}
