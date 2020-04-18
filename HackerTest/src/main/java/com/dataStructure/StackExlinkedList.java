package com.dataStructure;

public class StackExlinkedList {
	Node top;
	static class Node{
		Node next;
		int value;
		Node(int v){
			this.value =v;
		}
	}
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}else
			return false;
	}
	public boolean push(int v) {
		Node n= new Node(v);
		try {
			n.next =top;
			top = n;
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public int pop() {
		int v=-1;
		try {
			if(isEmpty()) {
				return v;
			}else {
				v =top.value;
				top = top.next;
				return v;
			}
		}catch(Exception e) {
			return v;
		}
	}

	public int peek() {
		int v=-1;
		try {
			if(isEmpty()) {
				return v;
			}else {
				v =top.value;
				return v;
			}
		}catch(Exception e) {
			return v;
		}
	}
	
	public static void main(String[] args) {
		StackExlinkedList stackExlinkedList = new StackExlinkedList();
		System.out.println("isEmpty    "+stackExlinkedList.isEmpty());
		stackExlinkedList.push(10);
		System.out.println(stackExlinkedList.peek());
		stackExlinkedList.push(20);
		System.out.println(stackExlinkedList.peek());
		stackExlinkedList.push(30);
		System.out.println(stackExlinkedList.peek());

		System.out.println("after pop");
		stackExlinkedList.pop();
		System.out.println(stackExlinkedList.peek());
		stackExlinkedList.pop();
		System.out.println(stackExlinkedList.peek());
		stackExlinkedList.pop();
		System.out.println(stackExlinkedList.peek());

	}

}
