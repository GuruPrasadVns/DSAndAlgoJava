package com.lienar.linkedlist;

public class LinkedList {
	
	private Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	// Time Complexity : O(1)
	// Space Complexity : O(1)
	public void addAtBeg(int data) {
		Node node = new Node(data);		
		node.next = head;
		head = node;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		int size = 0;
		Node q = head;
		while(q != null) {
			size++;
			q = q.next;
		}
		return size;
	}
	
	public void printList() {
		Node q = head;
		while(q != null) {
			System.out.print(q.data + "-->>");
			q = q.next;
		}
		System.out.println("NULL");
	}
}
