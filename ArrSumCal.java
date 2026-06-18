import java.util.Scanner;

/*
public class CalculateSum{
	public static void main (String args[]){
		Scanner sc = new Scanner;
		//System.out.println("Enter the size of array : ");
		//int size = sc.nextInt();
		
		int [] arr = [3,4,5,6,7,7];
		
		
		for (int i=0; i<arr.length;i++){
			
		}
	}
	
	n = arr[i];
	public static int findSum(int n, int accumulator) {
    if (n == 0) {
        return accumulator;
    }
    return factorial(n - 1, n + accumulator);
}
}
*/
public class ArrSumCal{
	public static int calSumRec(int [] arr,int index){
		if(index==arr.length){
			return 0 ;
		}
		return arr[index]+calSumRec(arr,index+1);
	}

	
	public static int calSumIterative(int [] arr){
		int sum=0;
		for (int i=0;i<arr.length; i++ ){
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void main (){
	
		int [] arr = {1,2,3,4,5,7,10};
		
	
	
	long recursiveStarttime = System.nanoTime();
	int recursiveSum = calSumRec(arr,0);
	long recursiveEndtime = System.nanoTime();
	long recursiveExecutionTime=recursiveEndtime-recursiveStarttime;
	System.out.println("recursive sum: "+recursiveSum);
	System.out.println("Recursive Execution time (in nanosec):"+recursiveExecutionTime);
	
	long interactiveStartTime = System.nanoTime();
	int iterativeSum = calSumIterative(arr);
	long iterativeEndtime  = System.nanoTime();
	long iterativeExecutionTime = iterativeEndtime-interactiveStartTime;
	System.out.println("iterativeSum:"+iterativeSum);
	System.out.println("iterative execution time:"+recursiveExecutionTime);
	
	/*
	long recursiveStarttime = System.nanotime();
	int recursiveSum = calculateSumRecursive(arr,0);
	long recursiveEndtime = System.nanotime();
	long recursiveExecutionTime=recursiveEndtime-recursiveStarttime;
	System.out.println("recursive sum"+recursiveSum);
	System.out.println("Recursive Execution time (in nanosec):"+recursiveExecutionTime);
	
	long interactiveStartTime = System.nanoTime();
	int iterativeSum = calculateSumInterative(arr);
	long iterativeEndtime  = System.nanoTime();
	long iterativeExecutionTime = iterativeEndtime-interactiveStartTime;
	System.out.println("iterativeSum:"+iterativeSum);
	System.out.printlnt("iterative execution time:"+recursiveExecutionTime);
	*/
	
	
}
}