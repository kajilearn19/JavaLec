public class ArrayADT1 {
    private int [] array;  // Global variable: maximum holding capacity
    private int size;      // Global variable: number of actual elements currently inside
    
    public ArrayADT1(int capacity) {
        array = new int[capacity]; 
        size = 0; // CORRECT: Start at 0 because the array is empty at the beginning!
    }
    
    public void insert(int index, int value) {
        // 1. Boundary check: index cannot be negative or skip existing elements
        if (index < 0 || index > size) {
            System.out.println("Index is out of range");
            return;
        }
        
        // 2. Full capacity check
        if (size == array.length) {
            System.out.println("Array is full");
            return;
        }
        
        // 3. Shift elements to the right to make a free space
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        
        // 4. Place the value and increase the current element count
        array[index] = value;
        size++;
    }
    
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main (String args[]) {
        ArrayADT1 arr = new ArrayADT1(5); // Maximum capacity is 5
        
        arr.insert(0, 10); // array:, size: 1
        arr.insert(1, 20); // array:, size: 2
        arr.insert(1, 15); // array:, size: 3 (15 inserted in the middle!)
        
        arr.display(); // Outputs: 10 15 20
    }
}
