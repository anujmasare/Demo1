package com.dataStructure;

public class CircularQueueArray {
	int a[] = new int[3];
	int top = -1, begin = 0;

	public boolean isEmpty() {
		if (begin == 0 && top ==-1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if ( top== a.length-1)
			return true;
		else
			return false;
	}

	public boolean enQueue(int v) {
		if (isFull())
			return false;
		else {
			if (top == a.length - 1) {
				top = 0;
				a[top] = v;
			} else {
				a[++top] = v;
			}
			return true;
		}
	}

	public int peek() {
		int v = -1;
		try {
			if (isEmpty())
				return -1;
			else {
				v = a[begin];
				return v;
			}
		} catch (Exception e) {
			return v;
		}
	}

	public int deQueue() {
		int v = -1;
		if (isEmpty())
			return -1;
		else {
			if (begin == a.length - 1) {
				v = a[begin];
				a[begin] = 0;
				begin = 0;
			} else {
				v = a[begin];
				a[begin] = 0;
				begin = begin + 1;
			}
			return v;
		}
	}

	public static void main(String[] args) {
		CircularQueueArray lqa = new CircularQueueArray();
		lqa.enQueue(10);
		System.out.println(lqa.peek());
		lqa.enQueue(20);
		System.out.println(lqa.peek());
		System.out.println("asdfasdfas" + lqa.deQueue());
		System.out.println(lqa.peek());
		lqa.enQueue(30);
		System.out.println("asdfasdfas" + lqa.deQueue());
		System.out.println(lqa.peek());

		System.out.println(lqa.enQueue(40));

	}

}
