package sample;

import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = 1)
	public void print2() {
		System.out.println("Testcase 02...Executed");
	}
}