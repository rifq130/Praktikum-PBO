import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int answer = 0;
		System.out.println("Enter a Number : ");
		int num1 = in.nextInt();
		System.out.println("Enter another Number : ");
		int num2 = in.nextInt();
		System.out.println("Enter the operand : ");
		char input = in.next().charAt(0);
		if(input == '*') {
			answer = num1 * num2;
		}else if(input == '/') {
			answer = num1 / num2;
		}else if(input == '%') {
			answer = num1 % num2;
		}else if(input == '+') {
			answer = num1 + num2;
		}else if(input == '-') {
			answer = num1 - num2;
		}else {
			System.out.println("Invalid Command");
		}
		System.out.println("the result is : "+answer);
	}

}
