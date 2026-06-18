/*
============ tail =======================
public static int factorial(int n, int accumulator) {
    if (n == 0) {
        return accumulator;
    }
    return factorial(n - 1, n * accumulator);
}

============== Non tail ==============
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

public class Combinations{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		
		char [] arr = {'a','b','c'};
		String [] arr = {}
		

		for (int i=0;i<arr.length;i++){
			
			String sum ="" ;
			
			for (int j=0; j<arr.length-1;j++){
			sum = arr[0]+arr[i+1];
			System.out.println(sum);
			}
		}
		
	}




*/



import java.util.Scanner;


public class Combinations {
	private static void generateCombinations(char[] chars,String currentCombinations,int index){
		System.out.println(currentCombinations);
		
		for(int i=index; i<chars.length; i++){
			generateCombinations(chars,currentCombinations+chars[i],i+1);
		}
		
	}	
		
	public static void main (String [] args){
			char[] chars = {'a','b','c'};
			generateCombinations(chars, "",0);
	}
	
}

















/*
System.out.println("Enter your char amount: ");
		int size = sc.nextInt();
		char [] arr = new int [size];
		
		for (int i=0;i<arr.length;i++){
		System.out.println("Enter your charactors:");
		arr[i]= sc.next.charAt(0);
		}
		
		*/