package com.dataStructure.recursion;

import java.util.Arrays;

public class SingleLinkedListOperation {
	Node head;
	Node tail;
	static class Node { 
		int value; 
		Node next; 
		Node(int d) 
		{ 
			value = d; 
			next = null; 
		} 
	} 

	public static SingleLinkedListOperation insert(SingleLinkedListOperation list, int data) 
	{ 
		Node new_node = new Node(data); 
		new_node.next = null; 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 
			last.next = new_node; 
		} 
		return list; 
	} 
	public static String searchInlist(SingleLinkedListOperation list,int v) {

		Node curr=list.head;
		boolean b=false;
		while(curr != null) {
			if(curr.value == v) {
				//System.out.println("mila");
				b=true;
				break;
			}
			curr=curr.next;
		}
		if(b)
			return "Mila";
		else 
			return "Nahi mila";


	}

	public static void printList(SingleLinkedListOperation list) {
		Node curr=list.head;
		while(curr != null){
			System.out.print("  "+curr.value);
			curr = curr.next;
		}
		System.out.println("");
	}

	public static void deleteFromList(SingleLinkedListOperation list,int v) {
		Node curr = list.head;
		while(curr !=null) {
			if(curr.value ==v) {
				if(curr == list.head) {
					list.head =curr.next;
				}else if(curr == list.tail) {

				}
			}

		}

	}

	public static SingleLinkedListOperation insertIntoList(SingleLinkedListOperation list,int v) {
		Node new_node = new  Node(v);
		new_node.next = null;
		if(list.head == null) {
			list.head = new_node;
		}else {
			Node curr=list.head;
			while(curr != null) {
				if(curr.next == null) {
					curr.next =new_node;
					curr.next =null;
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		SingleLinkedListOperation list = new SingleLinkedListOperation(); 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		//printList(list); 
		//printList(list);
		SingleLinkedListOperation list1 = new SingleLinkedListOperation(); 
		list1 = insertIntoList(list1, 1);
		list1 = insertIntoList(list1, 2); 
		printList(list1);
		//System.out.println(searchInlist(list,9));
	}

}
