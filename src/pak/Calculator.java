package pak;

import java.util.Scanner;

public class Calculator {
	 BalancedParan bp=new BalancedParan();
	OrderOfOperations oops;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] stringToCharArray = input.toCharArray();
		
		/*System.out.println(stringToCharArray);*/
		 
	/*	for (char output : stringToCharArray) {
			System.out.println(output);
		}
*/
		 if (new BalancedParan().areParenthesisBalanced(stringToCharArray)) {
			// System.out.println("true");
			 String str2 = String.valueOf(stringToCharArray);
			 System.out.println(new OrderOfOperations().brackets(str2));
			 
			 
			 
			 
		 }else{
			 System.out.println("Please input the correct and balanced query");
		 }

	}

}
