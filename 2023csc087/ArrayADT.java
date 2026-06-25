public class ArrayADT{
	private int [] array;  // array and size are the global variables 
	private int size;
	
	public ArrayADT(int capacity){
		array = new int [capacity]; // capacity is the local variable 
		size=0; // size naa ippo irukura elements , ella idamum element irukanum nu illa thane
	}
	
	public void insert(int index, int value){
		if(index<0 || index>array.length-1){
			System.out.println("index is out of range ");
		}
		else if (size==array.length){
			
			System.out.println("array is full ");
		}
		
		else {
			for (int i=size-1;i>=index;i--){
				array[i+1]= array[i];
			}
			array[index]=value;
			size++;
		}
	}
	public void traverse(){
		for(int i = 0; i< size; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void deletion(int index){
		if(index<0 || index > array.length -1){
			System.out.println("Index is out of range");
		}
		else if (size == 0){
			System.out.println("Array is empty");
		}
		
		else{
			for(int i = index; i< size-1; i++){
				array[i] = array[i+1];
			}
			array[size-1] = 0;
			size--;
		}
	}
	public int get (int index){
		if (index<0|| index>=size){
			System.out.println("Index is out of range");
		}
		return array[index];
	}
	public void set (int index, int value){
		if (index<0||index>=size){
			System.out.println("Index is out of range");
			array [index]=value ;
		}
	}
	public int getSize(){
		return size;
	}
	
	
	
	public static void main (String args[]){
		ArrayADT arr = new ArrayADT(5);

		arr.insert(0,8);
		arr.insert(1,4);
		arr.insert(2,2);
		arr.insert(2,5);
		arr.traverse();
		arr.deletion(2);
		arr.traverse();
		
		ArrayADT arr1 = new ArrayADT(5);
		
		arr1.insert(4,0);
		arr1.traverse();
		arr1.insert(3,5);
		arr1.traverse();
		
		ArrayADT arr2 = new ArrayADT(5);
		arr2.insert(0,4);
		arr2.insert(2,5);
		arr2.insert(3,5);
		arr2.traverse();
		arr2.insert(4,0);
		arr2.traverse();
		
		ArrayADT arr3 = new ArrayADT(5);
		
		arr3.insert(2,4);
		arr3.traverse();
		arr3.insert(3,5);
		arr3.traverse();
		
		ArrayADT arr4 = new ArrayADT(5);
		
		arr4.insert(1,4);
		arr4.insert(2,4);
		arr4.traverse();
		arr4.insert(3,5);
		arr4.traverse();
		
		
		
		//arr.insert(1,2);
		//arr.insert(2,3);
		
		
		
	}
	
}


/*



public void insertElement(int in,int el){
		if (arr.length-1<in ){
			System.out.println("Array is already full");
		}
		else if {
			array[in]=el;
		}
	}




*/