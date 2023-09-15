public class multAndDiv {
	public static void main(String [] args) {
		int num1 = addAndSub.getNumber();
		int num2 = addAndSub.getNumber();
		int product = multiply(num1, num2);
		addAndSub.print(product);
		int quotient = divide(num1, num2);
		addAndSub.print(quotient);
	}
		
	public static int multiply(int num1, int num2){
		int product = num1 * num2;
		return product;
	}
	public static int divide(int num1, int num2) {
		int quotient = num1 / num2;
		return quotient;
	}
}
