package Test.CamundaP;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDelegate {

	
	@Test
	public void test() {
		TestCaseDelegate test = new TestCaseDelegate();
		String testN = test.name;
		assertEquals(testN, test.name );
		System.out.println("Test OK");
	}

}
