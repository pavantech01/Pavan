import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] input) {
       int num=0;
	   int reversedNumber=0;

	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the digits you want to Reverse");
	   num =sc.nextInt();
	   
        while (num> 0) {
            int digit=num%10; //
            reversedNumber=reversedNumber*10+digit; 
            num=num/10;
        }
		 if (reversedNumber > 0) {
            System.out.println("The reverse of the given number is: " + reversedNumber);
        } else if (num == 0) {
            System.out.println("Input number cannot be zero");
        }else /* (num < 0) */{
            System.out.println("Input number cannot be negative");
        }
	}
}
