package com.stk.testng.hellotestng.com.stk.testng.hellotestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.stk.testng.hellotestng.Example;

public class ExampleTest {

	/**
	 * Test to check if the message is not null.
	 */

	@Test
	public void hello() {
		Example message = new Example();
		Assert.assertNotNull(message.hello());
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0;
	}

	@BeforeSuite
	public void print() {
		System.out.println("beforeTest");
	}

	@AfterSuite
	public void after() {
		System.out.println("afterTest");
	}

	@Test
	@Parameters({"myName","lastName"})
	public void parameterTest(String myName, String lastName) {
		Assert.assertNotNull(myName);
		Assert.assertEquals(myName, "adrian");
		Assert.assertEquals(lastName, "castro");

	}

	@Test
	public void method1() {
		System.out.println("This is method 1");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
	}

}
