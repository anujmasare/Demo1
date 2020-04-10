package com.dataStructure;

public class StackExArray {
	int a[] = new int[3];
	int top=-1;

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;

	}

	public boolean isFull() {
		if (top == a.length - 1)
			return true;
		else
			return false;
	}

	public boolean push(int value) {
		try {
			if(isFull()) {
				return false;
			}else {
				a[++top] =value;
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public int pop() {
		int value =-1;
		try {
			if(isEmpty()) {
				return -1;
			}else {
				value = a[top];
				a[top] =-1;
				top--;
				return value;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return value;
		}
	}

	public int peek() {
		int value =-1;
		try {
			if(isEmpty()) {
				return -1;
			}else {
				value = a[top];
				return value;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return value;
		}
	}

	
	public static void main(String[] args) {
		StackExArray stackExArray = new StackExArray();
		System.out.println("isEmpty    "+stackExArray.isEmpty());
		System.out.println("isFull   "+stackExArray.isFull());
		stackExArray.push(10);
		System.out.println(stackExArray.peek());
		stackExArray.push(20);
		System.out.println(stackExArray.peek());
		stackExArray.push(30);
		System.out.println(stackExArray.peek());
		System.out.println("isFull   "+stackExArray.isFull());
		System.out.println("after pop");
		stackExArray.pop();
		System.out.println(stackExArray.peek());
		stackExArray.pop();
		System.out.println(stackExArray.peek());
		stackExArray.pop();
		System.out.println(stackExArray.peek());
		

	}

}
