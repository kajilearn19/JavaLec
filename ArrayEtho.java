public class Array{
	private int[] array;
	private int size;
	
	
	
    public Array(int capacity){
		array = new int[capacity];
		size = 0;
	}
	
	public void insert( int index, int value){
		if (index < 0 || index > array.length-1){
			//System.out.println("Index is out of range");
		throw new IndexOutOfBoundsException("Index is out of range");
	}
	    else if (size == array.length){
		System.out.println("Array is full");
		} 
		else{
			//shift elements to make space for the new value
			for(int i = size-1; i >= index; i--){
				array[i+1] = array[i];
			}
			array[index] =  value;
			size++;
	}
	}
	
		public void deletion(int index){
		if(index<0 || index > array.length -1){
			//System.out.println("Index is out of range");
		throw new IndexOutOfBoundsException("Index is out of range");
		}
		else if (size == 0){
			System.out.println("Array is empty");
		}
		
		else{
			//shift elementsto the left to remove the element at the given index
			for(int i = index; i< size-1; i++){
				array[i] = array[i+1];
			}
			array[size-1] = 0;
			size--;
		}
	}
	 
	
	public void traverse(){
		for(int i = 0; i< size; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	public int get(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index is out of range");
		}
		return array[index];
	}
	
	public void set(int index , int value){
		if (index <0 || index >= size){
			throw new IndexOutOfBoundsException("Index is out of range");
		}
		
		array[index] = value;
	}
	
	public int getSize(int size){
		return size;
	}
	

	
	
	                                                                                                                                                               
 public static void main(String [] args){
	 Array arr = new Array(5); 
	  
	 arr.insert(0,8);
	 arr.traverse();
	 arr.deletion(0);
	 arr.traverse();
	
	// System.out.println("The final array is");
	// for (int i =0; i<= size-1; i++){

	// }
 }
}
