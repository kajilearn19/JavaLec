import java.util.Scanner;

class Factorial{
	static int(factorial int n){
		if (n==0 || n==1 ){
			return 1;
		}
		else {
			factorial(n*(n-1));
		}
	}


static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
}

}


/*

f(1)=1
f(0)=1
f(2)=2*1
f(3)=3*2*1


*?