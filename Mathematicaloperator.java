/*
op num1 num2 
funtion - performOperation 
input - that 2 numbers 
*/

public class Mathematicaloperator{
	private char op ;
	private int num1;
	private int num2;
	
	public Mathematicaloperator (char op, int num1,int num2){
		
	switch (op){
		case '+': return num1+num2;
		
		case '-': return num1-num2;
		
		case '*': return num1*num2;
		
		case '/': return num1/num2;
	}
	}
}