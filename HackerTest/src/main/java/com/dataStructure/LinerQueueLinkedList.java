package com.dataStructure;

public class LinerQueueLinkedList {
	Node top;
	Node begin;
	Node head;
	Node tail;

	static class Node {
		int v;
		Node next;

		Node(int v) {
			this.v = v;
		}
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	public void enQueue(int i) {
		Node n = new Node(i);
		if (tail == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail =n;
		}
	}
	public int deQueue() {
		int v=-1;
		if(head == null)
			return -1;
		else {
			if(head != tail) {
				v =head.v;
				head = head.next;
			}else {
				head =null;
				tail =null;
				
			}
		}
		return v;

	}
	public int peek() {
		int v=-1;
		try {
			if(head == null)
				return v;
			else 
				return head.v;

		}catch(Exception e) {
			return v;	
		}
	}

	public static void main(String[] args) {
		LinerQueueLinkedList lqa = new LinerQueueLinkedList();
		lqa.enQueue(10);
		System.out.println(lqa.peek());
		lqa.enQueue(20);
		System.out.println(lqa.peek());
		System.out.println("asdfasdfas" + lqa.deQueue());
		System.out.println(lqa.peek());
		lqa.enQueue(30);
		System.out.println("asdfasdfas" + lqa.deQueue());
		System.out.println(lqa.peek());

		lqa.enQueue(40);


	}

}
