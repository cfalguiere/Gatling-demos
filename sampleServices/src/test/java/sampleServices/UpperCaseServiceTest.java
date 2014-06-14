package sampleServices;

import static org.junit.Assert.*;

import org.junit.Test;

public class UpperCaseServiceTest {

	@Test
	public void testProcessA() {
		UpperCaseService upper = new UpperCaseService();
		String output = upper.process("a");
		assertEquals("A", output);
	}

}
