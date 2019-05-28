package com.bae.blackjack.tests;

import com.bae.blackjack.mainapp.Blackjack;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TwistTest {
	
	
	static Blackjack blackjack;
	
	@BeforeClass
	public static void setup() {
		blackjack = new Blackjack();
		}
	
	
	@Test
	public void test19() {
		int a = blackjack.twist();
		System.out.println(a);
		assertEquals(10+a, blackjack.play(25, 10+a));
	}
	
	
	@Test
	public void test20() {
		
		ArrayList <Integer> twistList = new ArrayList <Integer> ();
		
		for(int i=0; i<1000; i++) {
			twistList.add(blackjack.twist());
		}
		
		for(int n:twistList) {
			if(n > 0 && n<12) {
				continue;
			}
			else {
				fail();
			}
		}
		assertTrue(true);
	}
	
/*	@Test
	public void test1(){
		assertEquals(1, twistValue);
	}
	@Test
	public void test2(){
		assertEquals(2,twistValue );
	}
	@Test
	public void test3(){
		assertEquals(3,twistValue);
	}
	@Test
	public void test4(){
		assertEquals(4,twistValue);
	}
	@Test
	public void test5(){
		assertEquals(5, twistValue);
	}
	@Test
	public void test6(){
		assertEquals(6, twistValue);
	}
	@Test
	public void test7(){
		assertEquals(7, twistValue);
	}
	@Test
	public void test8(){
		assertEquals(8, twistValue);
	}
	@Test
	public void test9(){
		assertEquals(9, twistValue);
	}
	@Test
	public void test10(){
		assertEquals(10, twistValue);
	}
	@Test
	public void test11(){
		assertEquals(11,twistValue );
	}*/
	
	
	

	

}
