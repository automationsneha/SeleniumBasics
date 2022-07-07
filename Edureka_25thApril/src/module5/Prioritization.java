package module5;

import org.testng.annotations.Test;

public class Prioritization {

	@Test(priority = 0)
	public void Pune() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 11)
	public void Banglore() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 42)
	public void Mumbai() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 333)
	public void Hyderabad() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 498)
	public void Chennai() {
		System.out.println("This is the Test Case 5");
	}	
	
	
}
