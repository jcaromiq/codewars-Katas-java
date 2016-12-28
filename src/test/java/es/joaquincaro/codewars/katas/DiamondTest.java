package es.joaquincaro.codewars.katas;

import org.junit.Test;

import es.joaquincaro.codewars.katas.Diamond;

import static org.junit.Assert.assertEquals;

public class DiamondTest {
	@Test
	public void testDiamond3() {
		StringBuffer expected = new StringBuffer();
		expected.append(" *\n");
		expected.append("***\n");
		expected.append(" *\n");

		assertEquals(expected.toString(), Diamond.print(3));
	}

	@Test
	public void testDiamond5() {
		StringBuffer expected = new StringBuffer();
		expected.append("  *\n");
		expected.append(" ***\n");
		expected.append("*****\n");
		expected.append(" ***\n");
		expected.append("  *\n");

		assertEquals(expected.toString(), Diamond.print(5));
	}
}
