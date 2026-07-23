class Node{ //instance create paanna
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}

	


class LinkedListADT{
	
		Node head;

		public LinkedListADT(){
			this.head=null;
		}
		public boolean isEmpty(){
			return head==null;
		}
		int getSize(){
			int count = 0;
			Node current = head;
			while (current != null) {
            count++;
            current = current.next;
        }
		
        return count;
		}
		void insertAtFront (int data){
			Node newNode = new Node(data);
			if (isEmpty()){
				head= newNode;
			}
			else {
				newNode.next=head;
				head=newNode;
			}
		}
		public void insertAtEnd(int data){
			Node newNode = new Node(data);
			if(isEmpty()){
				head=newNode;
			}
			else{
				Node current = head;
				while(current.next!=null){
					current=current.next;
				}
				current.next=newNode;
			}
		}
		public void display(){
			if(isEmpty()){
				System.out.println("Linked list is empty");
			}
			else {
				Node current = head;
				while(current!=null){
					System.out.println(current.data+" ");
					current =current.next;
				}
				System.out.println();
			}
		}
		public void insertAtIndex(int data,int index){
			if(index<1||index>getSize()+1){
				System.out.println("Invalid index");
				return;
			}
			if (index==1){
				insertAtFront(data);
				return;
			}
			Node newNode = new Node(data);
			Node current = head;
			
			for (int c=1; c<index-1; c++){
				current=current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
}
		
		
		
		
		


public class SingleLinkedList{
    public static void main(String[] args) {
        LinkedListADT linlist1 = new LinkedListADT();
        

        System.out.println(linlist1.isEmpty()); 
        

        linlist1.insertAtFront(10);
        linlist1.insertAtFront(5);
        System.out.println("Data at front: " + linlist1.head.data);
		linlist1.insertAtEnd(10);
		linlist1.display();
		linlist1.insertAtIndex(2,33);
		linlist1.display();
		
		


		
    }
}








/*

public boolean isEmpty(){
	
return head==null;
}

class SingleLinkedList {
			public static void main (String args){
			LinkedListADT linlist1 = new LinkedListADT();
			linlist1.insertAtFront(10);
			linlist1.insertAtFront(20);
			linlist1.insertAtFront(30);
			linlist1.display();

			}
			
			for (int i = size - 1; i >= index; i--) {
				array[i + 1] = array[i];
			}
			array[index] = value;
			size++;
			System.out.println(value+ " inserted at "+ index);
}
*/