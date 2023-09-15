import java.util.Scanner;
public class Calculator {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		
		boolean cont = true;
		
		do {
			System.out.println("Enter + to add");
			System.out.println("Enter - to subtract");
			System.out.println("Enter * to multiply");
			System.out.println("Enter / to divide");
			System.out.println("Enter ! to exit");
		
			char option = keyboard.next().charAt(0);
		
			int updated = 0;
			char save = 'y';
		
			if(option == '+') {
				int num1 = addAndSub.getNumber();
				int num2 = addAndSub.getNumber();
				int sum = addAndSub.add(num1, num2);
				addAndSub.print(sum);
				while(save == 'y') {
					System.out.println("Would you like to save this number for your next calculation? (y/n)?");
					save = keyboard.next().charAt(0);
					if(save != 'n') {
						update(sum, updated);
					}
				}
			}
			if(option == '-') {
				int num1 = addAndSub.getNumber();
				int num2 = addAndSub.getNumber();
				int difference = addAndSub.sub(num1, num2);
				addAndSub.print(difference);
				while(save == 'y') {
					System.out.println("Would you like to save this number for your next calculation? (y/n)?");
					save = keyboard.next().charAt(0);
					if(save != 'n') {
						update(difference, updated);
					}
				}
			
			}
			
			if(option == '*') {
				int num1 = addAndSub.getNumber();
				int num2 = addAndSub.getNumber();
				int product = multAndDiv.multiply(num1, num2);
				addAndSub.print(product);
				while(save == 'y') {
					System.out.println("Would you like to save this number for your next calculation? (y/n)?");
					save = keyboard.next().charAt(0);
					if(save != 'n') {
						update(product, updated);
					}
				}
			}
			
			if(option == '/') {
				int num1 = addAndSub.getNumber();
				int num2 = addAndSub.getNumber();
				int quotient = multAndDiv.divide(num1, num2);
				addAndSub.print(quotient);
				while(save == 'y') {
					System.out.println("Would you like to save this number for your next calculation? (y/n)?");
					save = keyboard.next().charAt(0);
					if(save != 'n') {
						update(quotient, updated);
					}
				}
			}
			if(option == '!') {
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}while(cont == true);
	}

	public static void update(int total, int newNum) {
		Scanner keyboard = new Scanner(System.in);
		newNum = total;
		System.out.println("Do you want to add, subtract, multiply, or divide? (+, -, *, /)");
		char operation = keyboard.next().charAt(0);
		if(operation == '+') {
			int num2 = addAndSub.getNumber();
			int sum2 = addAndSub.add(newNum, num2);
			addAndSub.print(sum2);
		}
		
		if(operation == '-') {
			int num2 = addAndSub.getNumber();
			int diff = addAndSub.sub(newNum, num2);
			addAndSub.print(diff);
		}
		
		if(operation == '*') {
			int num2 = addAndSub.getNumber();
			int pro = multAndDiv.multiply(newNum, num2);
			addAndSub.print(pro);
		}
		if(operation == '/') {
			int num2 = addAndSub.getNumber();
			int quo = multAndDiv.divide(newNum, num2);
			addAndSub.print(quo);
		}
	}
	
}
