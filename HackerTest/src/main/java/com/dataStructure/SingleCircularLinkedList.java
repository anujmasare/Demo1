package com.dataStructure;

public class SingleCircularLinkedList {
	Node head;
	Node tail;
	static class Node{
		Node next ;
		int value;
		Node(int v){
			this.value =v;
			//next = null;
		}
		Node(int v,Node next){
			this.value =v;
			this.next = next;
		}
	}
	public static SingleCircularLinkedList insertAtEnd(SingleCircularLinkedList list,int value) {
		Node n= new Node(value);
		Node curr = list.head;
		if(curr ==null) {
			list.head =n;
			list.tail =n;
			n.next =n;  
		}else {
			list.tail.next =n;
			list.tail = n;
			list.tail.next =list.head;
		}
		return list;
	}


	public static SingleCircularLinkedList insertAtAnyLocation(SingleCircularLinkedList list,int value,int nextTo) {
		Node curr = list.head;
		Node prvNode= null,nextNode= null;
		Node n = new Node(value);
		if(curr ==null)//EMPTY
		{
			list.head = n;
			list.tail = n;
			n.next =n;

		}else {
			if(nextTo < 0) {//StartingPosition
				list.tail.next =n;
				n.next=list.head;
				list.head =n;
				
			}else {
				int position=0;
				while(position <= nextTo && curr != list.head) {
					position++;
					prvNode =curr;
					nextNode = curr.next;
					curr= curr.next;
				}

				//prvNode nextNode
				
				
				
				
				
				
				
				
				
				
				
//				if(prvNode.next == list.tail) {
//					list.tail = n;
//					prvNode.next =n;
//				}else {
//					prvNode.next =n;
//				}
//
//				if(nextNode != null)
//					n.next =nextNode;
//				else
//					list.tail =n;

			}
		}


		return list;

	}



	public static String searchInlist(SingleCircularLinkedList list,int v) {

		Node curr=list.head;
		boolean b=false;
		while(curr.next != list.head) {
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

	public static void printList(SingleCircularLinkedList list) {
		Node curr=list.head;
		if(curr != null)
		{
			do {
				System.out.print(curr.value+" ");
				curr = curr.next;
			}while(curr != list.head);
		}
		System.out.println("");
	}

	public static void deleteFromList(SingleCircularLinkedList list,int v) {
		Node curr = list.head;
		Node preNode=list.head;
		while(curr !=null) {
			if(curr.value == v) {
				if(list.tail.next == list.head.next) {//first node
					list.head = null;
					list.tail = null;
				}else if(list.head ==curr) {
					list.head =curr.next;
				}
				else if(curr.next ==list.tail.next) //end
				{
					list.tail =preNode;
					preNode.next =null;
				}
				else {//midddle
					preNode.next = curr.next;
				}


			}
			preNode =curr;
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		SingleCircularLinkedList list = new SingleCircularLinkedList();

		list = insertAtEnd(list, 1);
		System.out.println(list.head.value+"        "+list.tail.value);
		list = insertAtEnd(list, 2);
		System.out.println(list.head.value+"        "+list.tail.value);
		list = insertAtEnd(list, 3);
		System.out.println(list.head.value+"        "+list.tail.value);
		printList(list);//Print the value


		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");


		SingleCircularLinkedList list2 = new SingleCircularLinkedList();
		list2 = insertAtAnyLocation(list2, 8,-1);//at the start
		System.out.println(list2.head.value+"        "+list2.tail.value);
		list2 = insertAtEnd(list2, 1);
		list2 = insertAtAnyLocation(list2, 11,2);//at the start
		list2 = insertAtEnd(list2, 2); 
		System.out.println(list2.head.value+"        "+list2.tail.value);
		list2 = insertAtAnyLocation(list2, 9,4);//at the middle 
		System.out.println(list2.head.value+"        "+list2.tail.value);
		list2 = insertAtAnyLocation(list2, 10,100);//at the end 
		System.out.println(list2.head.value+"        "+list2.tail.value);

		printList(list2);//Print the value	
//
//		System.out.println(searchInlist(list2, 2));//Search
//
//		deleteFromList(list2, 1);//DELETE
//		printList(list2);//Print the value
//		deleteFromList(list2, 10);//DELETE
//		printList(list2);//Print the value
//		deleteFromList(list2, 11);//DELETE
//		printList(list2);//Print the value
//		deleteFromList(list2, 2);//DELETE
//		printList(list2);//Print the value
//		deleteFromList(list2, 9);//DELETE
//		System.out.println("jjj");
//		printList(list2);//Print the value
//






	}

}
