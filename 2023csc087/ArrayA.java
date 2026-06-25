public class ArrayA{
	public static void main (String args []){
		int [] arr1 = {1,3,4,2,5,8};
		int [] arr2 = {3,1,3,4,5,6};
		int [] arr3 = {1,2,3,4,5};
		
		System.out.println("Is array 1 sorted?"+isSorted(arr1));
		System.out.println("Is array 2 sorted?"+isSorted(arr2));
		System.out.println("Is array 3 sorted?"+isSorted(arr3));
		

	}
	public static boolean isSorted(int [] arr){
		for (int i=0;i<arr.length-1; i++){   // i++ a thookinaal (A)
			if (arr[i]>arr[i+1]){ 
				return false ;
			}
			// inka i++ a podalaam (A)
			
		}
		return true;
	}
}

for (int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}