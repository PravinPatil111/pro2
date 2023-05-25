package com.testCase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class simpleTest {
	
	@BeforeClass
	public static void envionmetSetup() {
		
		System.out.println("Set the Envoirnment");
}
		@Test
		public void test1() {
		
		System.out.println("test");
		
	}
		@Test
		public void test2() {
		
		System.out.println("test2");}
		@AfterClass
		
		public static void envionmetClose() {
			
		System.out.println("Closing the Envoirnment !!!!!!!!!!!!!!!!");
		}

	}
