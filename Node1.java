// 1. Node Class Definition
class Node { 
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// 2. LinkedList ADT Class Definition
class LinkedListADT {
    Node head;

    public LinkedListADT() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}

// 3. Main Execution Class
public class Main {
    public static void main(String[] args) {
        LinkedListADT linlist1 = new LinkedListADT();
        
        // Checks if empty (Outputs: true)
        System.out.println("Is list empty? " + linlist1.isEmpty()); 
        
        // Insert elements
        linlist1.insertAtFront(10);
        linlist1.insertAtFront(5);
        linlist1.insertAtEnd(20);
        
        // Display the elements
        System.out.print("Linked List: ");
        linlist1.display(); 
    }
}
