package com.lienar.linkedlist;

public class LinkedList {
	
	private Node head;
	
	
	public Node getHead() {
		return head;
	}

	public class Node {
		public int data;
		public Node next;
		
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
	
	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public int size() {
		int size = 0;
		Node q = head;
		while(q != null) {
			size++;
			q = q.next;
		}
		return size;
	}
	
	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public void printList() {
		Node q = head;
		while(q != null) {
			System.out.print(q.data + "-->>");
			q = q.next;
		}
		System.out.println("NULL");
	}
	
	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public void addAtEnd(int data) {
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
		}else {
			Node q = head;
			while(q.next != null) {
				q = q.next;
			}
			q.next = node;
		}
		
	}
	
	// Time Complexity : O(1)
	// Space Complexity : O(1)
	public void addAfterNode(int data, Node oldNode) {
		if(oldNode == null)
			return;
		Node node = new Node(data);
		node.next = oldNode.next;
		oldNode.next = node;
	}
	
	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public void deleteNodeByItem(int item) {
		Node q = head;
		Node p = null;
		if(head == null) {
			return;
		}
		if(q.data == item) {
			head = head.next;
			return;
		}
		while(q != null && q.data != item) {
			p = q;
			q = q.next;
		}
		if(q == null) {
			return;
		}
		else
		{			
			p.next = q.next;
		}
	}
	
	public void deleteNodeByPosition(int index) {
		if(head == null || index < 0)
			return;
		Node q = head;
		Node p = null;
		int i = 0;
		
		if(index == 0) {
			head = head.next;
			return;
		}
		
		while (i < index || q != null) {
			p = q;
			q = q.next;
			i++;
		}
		
		
			
	}	
		
		
	
}
