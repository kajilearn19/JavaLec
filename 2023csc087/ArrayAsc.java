public class ArrayAsc{
	public static void main (String args []){
		int [] arr1 = {1,3,4,2,5,8};
		int [] arr2 = {3,1,3,4,5,6};
		int [] arr3 = {1,2,3,4,5,6};

		
		System.out.println("Is array 1 sorted?"+isSorted(arr1));
		System.out.println("Is array 2 sorted?"+isSorted(arr2));
		System.out.println("Is array 3 sorted?"+isSorted(arr3));

		

	}
	public static boolean isSorted(int [] arr){
		for (int i=0;;){

		if (i<arr.length-1)return true;
			if (arr[i]>arr[i+1]){
				return false ;
			}
			i++;
			
		
		
		}
	}
}


