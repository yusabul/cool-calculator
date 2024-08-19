import java.util.Scanner;
public class addAndSub {
	public static void main(String [] args) {
		int num1 = getNumber();
		int num2 = getNumber();
		int sum = add(num1, num2);
		print(sum);
		int difference = sub(num1, num2);
		print(difference);
	}

	public static int getNumber(){
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = keyboard.nextInt();
		return num;
	}
	
	public static int add(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}
	public static int sub(int num1, int num2) {
		int difference = num1 - num2;
		return difference;
	}
	public static void print(int total) {
		System.out.println(total);
	}
}




