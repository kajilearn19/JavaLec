class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class StackADT {
    Node top;

    public StackADT() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }

        String data = top.data;
        top = top.next;
        return data;
    }
}

public class StackADTLLQ {

    public static void main(String[] args) {

        String str = "Madam, I'm Adam";
        StackADT stack = new StackADT();

        // Push only letters and numbers
        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch)); // Push as String
            }
        }

        boolean palindrome = true;

        // Compare with popped values
        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (Character.isLetterOrDigit(ch)) {

                String popped = stack.pop();

                if (!String.valueOf(ch).equals(popped)) {
                    palindrome = false;
                    break;
                }
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}