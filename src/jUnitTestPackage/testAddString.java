package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;


public class testAddString {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		String result = junit.addString("Hari","Pranesh");
		assertEquals ("HariPranesh", result);
	}

}