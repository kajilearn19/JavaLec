class Node { 
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
		public void deleteAtFront(){
			if (isEmpty()){
				System.out.println("Linked list is empty");
			}
			else {
				head=head.next;
			}
		}
		public void deleteAtEnd(){
			if(isEmpty()){
				System.out.println("Linked list is empty");
			}
			else{
				Node current = head;

				while (current.next.next != null) {
				current = current.next;
				}
				current.next = null;
			}
		}
		public void deleteAtEndN() {
			if(isEmpty()){
				System.out.println("Linked list is empty");
			}
			else if (head.next==null){
				head=null;
			}
			else {
				Node current = head;
				Node previous = null;
				while (current.next!=null){
					previous = current;
					current=current.next;
				}
				previous.next=null;
			}
			
		}
		
		public void deleteAtIndex(int data,int index){
			if(index<1||index>getSize()){
				System.out.println("Invalid index");
				return;
			}
			if (index==1){
				deleteAtFront(data);
				return;
			}
			if (index == 1) {
			deleteAtFront(); 
			return;
		    }
			
			Node current = head;
			for (int c = 1; c < index - 1; c++) {
				current = current.next;
			}
			current.next = current.next.next;
		}
		
}
			
   
    

    
	
		
		
		
		


public class SingleLinkedList1 {
    public static void main(String[] args) {
        LinkedListADT linlist1 = new LinkedListADT();
        

        System.out.println(linlist1.isEmpty()); 
        

        linlist1.insertAtFront(10);
        linlist1.insertAtFront(5);
		linlist1.getSize();
        System.out.println("Data at front: " + linlist1.head.data);
		linlist1.insertAtEnd(10);
		linlist1.display();
		linlist1.insertAtIndex(2,33);
		linlist1.display();
		linlist1.deleteAtEnd();
		linlist1.display();
		linlist1.insertAtEnd(100);
		linlist1.getSize();
		linlist1.display();
		linlist1.deleteAtEndN();
		linlist1.display();
		
		


		
    }
}






    
    



