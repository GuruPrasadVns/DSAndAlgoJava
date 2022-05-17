package com.linear.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lienar.linkedlist.LinkedList;

public class LinkedListTest {
	
	@Test
	public void isEmptyTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		list.addAtBeg(1);
		assertFalse(list.isEmpty());
	}
}
