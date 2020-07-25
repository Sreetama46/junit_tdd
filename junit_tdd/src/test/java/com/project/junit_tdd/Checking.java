package com.project.junit_tdd;

import junit.framework.TestCase;

public class Checking extends TestCase {
	
	public void test() {
		Junit_tdd obj=new Junit_tdd();
		String output1=obj.check("ABCD");
		assertEquals("BCD",output1);
		String output2=obj.check("AACD");
		assertEquals("CD",output2);
		String output3=obj.check("BACD");
		assertEquals("BCD",output3);
		String output4=obj.check("BBAA");
		assertEquals("BBAA",output4);
		String output5=obj.check("AABAA");
		assertEquals("BAA",output5);
	}

}
