package sample;

import org.testng.annotations.Test;

public class Test1 {
	@Test(priority = 1)
	public void print1() {
		System.out.println("Testcase 01...Executed");
	}
}