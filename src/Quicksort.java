import java.util.Scanner;

public class Quicksort {
	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.prev = null;
			this.next = null;
			this.data = data;
		}
	}

	Node head;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	public void delNode(int data) {
		Node temp;
		if (head == null) {
			System.out.println("not possible");
			return;
		}
		if (head.data == data) {
			temp = head;
			head = head.next;
			head.prev = null;
			return;

		}
		temp = head;
		while (temp != null) {
			if (temp.data == data) {
				temp.next.prev = temp.prev;
				temp.prev.next = temp.next;
			}

		}
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("nothing in it");
		} else {
			while (temp.next != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
     Quicksort q=new Quicksort();
     while(true) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("1 add node\n 2 deletenode\n 3 exit\n");
    	 System.out.println("enter the choice");
    	 char ch=sc.nextLine().charAt(0);
    	 switch(ch) {
    	 case '1' :System.out.println("enter the data");
    	         q.addNode(sc.nextInt());
    	         q.display();
    	         break;
    	 case '2' :System.out.println("delete the data");
         q.delNode(sc.nextInt());
         q.display();
         break;
    	 case '3':return;
    	 
     }
	}

}
	}
