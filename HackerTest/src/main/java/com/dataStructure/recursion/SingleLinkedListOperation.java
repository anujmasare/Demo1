package com.dataStructure.recursion;

public class SingleLinkedListOperation {
	Node head;
	Node tail;
	static class Node{
		Node next ;
		int value;
		Node(int v){
			this.value =v;
			next =null;
		}
	}
	public static SingleLinkedListOperation insertAtEnd(SingleLinkedListOperation list,int value) {
		Node n= new Node(value);
		Node curr =  list.head;
		Node pre=null;
		if(curr ==null) {
			list.head =n;
			list.tail =n;
		}else {
			while(curr !=null) {
				pre = curr;
				curr=curr.next;
			}
			pre.next = n;
			list.tail =n;
		}
		return list;
	}


	public static SingleLinkedListOperation insertAtAnyLocation(SingleLinkedListOperation list,int value,int nextTo) {
		Node curr = list.head;
		Node prvNode= null,nextNode= null;
		Node n = new Node(value);
		if(curr ==null)
		{
			list.head = n;
			list.tail = n;
		}else {
			if(nextTo <0) {
				n.next=list.head.next;
				list.head =n;
			}else {
				while(curr != null) {
					if(curr.value == nextTo)
					{
						prvNode =curr;
						nextNode = curr.next;
						curr =null;
					}else {
						prvNode =curr;
						curr =curr.next;
					}
				}
				if(prvNode != null)
					if(prvNode.next == null) {
						list.tail = n;
						prvNode.next =n;
					}else {
						prvNode.next =n;
					}


				if(nextNode != null)
					n.next =nextNode;
				else
					list.tail =n;

			}
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
			System.out.print(curr.value+" ");
			curr = curr.next;
		}
		System.out.println("");
	}

	public static void deleteFromList(SingleLinkedListOperation list,int v) {
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

		SingleLinkedListOperation list2 = new SingleLinkedListOperation();
		list2 = insertAtAnyLocation(list2, 8,-1);//at the start
		System.out.println(list2.head.value+"        "+list2.tail.value);
		list2 = insertAtEnd(list2, 1);
		list2 = insertAtAnyLocation(list2, 11,-1);//at the start
		list2 = insertAtEnd(list2, 2); 
		System.out.println(list2.head.value+"        "+list2.tail.value);
		list2 = insertAtAnyLocation(list2, 9,1);//at the middle 
		System.out.println(list2.head.value+"        "+list2.tail.value);
		list2 = insertAtAnyLocation(list2, 10,100);//at the end 
		System.out.println(list2.head.value+"        "+list2.tail.value);
		
		
		printList(list2);//Print the value	
		
		System.out.println(searchInlist(list2, 2));//Search
		
		deleteFromList(list2, 1);//DELETE
		printList(list2);//Print the value
		deleteFromList(list2, 10);//DELETE
		printList(list2);//Print the value
		deleteFromList(list2, 11);//DELETE
		printList(list2);//Print the value
		deleteFromList(list2, 2);//DELETE
		printList(list2);//Print the value
		deleteFromList(list2, 9);//DELETE
		System.out.println("jjj");
		printList(list2);//Print the value
		
		
		
		
		
		
		
	}

}
