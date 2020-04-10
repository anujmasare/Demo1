package com.dataStructure;

public class LinerQueueArray {
	int a[] = new int[3];
	int top = -1, begin = 0;

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (a.length-1== top)
			return true;
		else
			return false;
	}

	public boolean enQueue(int v) {
		if (isFull())
			return false;
		else {
				a[++top] = v;
			}
			return true;
		}

	public int peek() {
		int v = -1;
		if (isEmpty())
			return -1;
		else {
			v = a[begin];
			return v;
		}
	}

	public int deQueue() {
		int v = -1;
		if (isEmpty())
			return -1;
		else {
				v = a[begin];
				a[begin] = 0;
				begin++;
			}
			return v;
	}

	public static void main(String[] args) {
		LinerQueueArray lqa = new LinerQueueArray();
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
