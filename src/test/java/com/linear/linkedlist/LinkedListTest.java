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
	
	@Test
	public void sizeTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		list.addAtBeg(4);
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		list.addAtBeg(3);
		list.addAtBeg(2);
		list.addAtBeg(1);
		assertEquals(4, list.size());
	}
	
	@Test
	public void printListTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		list.addAtBeg(4);
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		list.addAtBeg(3);
		list.addAtBeg(2);
		list.addAtBeg(1);
		assertEquals(4, list.size());
		list.printList();
	}
	
	@Test
	public void addAtEndTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		list.addAtEnd(1);
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		list.addAtEnd(2);
		list.addAtEnd(3);
		list.addAtEnd(4);
		assertEquals(4, list.size());
		list.printList();
	}
	
	@Test
	public void addAfterNode() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		list.addAfterNode(5, null);
		list.addAtEnd(5);
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		list.addAfterNode(10, list.getHead());
		assertEquals(2, list.size());
		list.addAfterNode(15, list.getHead().next);
		assertEquals(3, list.size());
		list.printList();
	}
	
	@Test
	public void deleteNodeByItemTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		list.deleteNodeByItem(5);
		list.addAtEnd(1);
		list.addAtEnd(2);
		list.addAtEnd(3);
		list.addAtEnd(4);
		list.addAtEnd(5);
		list.addAtEnd(6);
		list.addAtEnd(7);
		list.addAtEnd(8);
		list.addAtEnd(9);
		list.addAtEnd(10);
		assertFalse(list.isEmpty());
		assertEquals(10, list.size());
		list.printList();
		list.deleteNodeByItem(7);
		assertFalse(list.isEmpty());
		assertEquals(9, list.size());
		list.printList();
		list.deleteNodeByItem(1);
		list.printList();
		list.deleteNodeByItem(10);
		list.printList();
		list.deleteNodeByItem(11);
		list.printList();
	}
}
