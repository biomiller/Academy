package com.bae.blackjack.tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.mainapp.Blackjack;


public class BlackjackUnitTest {

	static Blackjack blackjack;
	
	@BeforeClass
	public static void setup() {
		blackjack = new Blackjack();
	}
	
	
	@Test
	public void test1(){
		assertEquals(0,blackjack.play(0,0));
	}
	
	@Test
	public void test2() {
		assertEquals(21, blackjack.play(0, 21));
	}
	
	@Test
	public void test3() {
		assertEquals(21, blackjack.play(21, 0));
	}
	
	@Test
	public void test4() {
		assertEquals(10, blackjack.play(10, 10));
	}
	
	@Test
	public void test5() {
		assertEquals(21, blackjack.play(30, 21));
	}
	
	@Test
	public void test6() {
		assertEquals(-1, blackjack.play(31, 22));
	}
	
	
	
	//1
	@Test
	public void test7() {
		assertEquals(10, blackjack.play(25, 10));
	}
	
	
	//2
	@Test
	public void test8() {
		assertEquals(10, blackjack.play(10, 25));
	}
	
	
	//3
	@Test
	public void test9() {
		assertEquals(0, blackjack.play(25, 25));
	}
	
	//4
	@Test
	public void test10() {
		assertEquals(21, blackjack.play(10, 21));
	}
	

	// 5
	@Test
	public void test11() {
		assertEquals(21, blackjack.play(21, 10));
	}
	
	// 6
	@Test
	public void test12() {
		assertEquals(-1, blackjack.play(31, 31));
	}
	
	// 7
	@Test
	public void test13() {
		assertEquals(-1, blackjack.play(1, 1));
	}
	
	// 8
	@Test
	public void test14() {
		assertEquals(-1, blackjack.play(10, 31));
	}
	
	// 9
	@Test
	public void test15() {
		assertEquals(-1, blackjack.play(10, 1));
	}
	
	// 10
	@Test
	public void test16() {
		assertEquals(-1, blackjack.play(31, 10));
	}
	
	// 11
	@Test
	public void test17() {
		assertEquals(10, blackjack.play(30, 10));
	}
	
	// 12
	@Test
	public void test18() {
		assertEquals(-1, blackjack.play(1, 10));
	}
	
	// 13
	@Test
	public void test19() {
		assertEquals(10, blackjack.play(4, 10));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
