// Using Stack ADT implemented by array: write a program to convert a decimal number to its binary representation.
public class DecimalToBinary 
{
    public static void main(String[] args) 
    {
        StackADT stack = new StackADT(32); 
        int decimalNumber = 10;

        System.out.println("Decimal Number: " + decimalNumber);
        while(decimalNumber > 0)       
        {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }
        stack.display();
    }
}
