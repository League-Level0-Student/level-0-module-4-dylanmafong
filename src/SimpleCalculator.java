
import javax.swing.JOptionPane;
public class SimpleCalculator {
	public static void main(String[] args) {
		// 1. Get 2 numbers from the user and convert them to integer.st
		String number = JOptionPane.showInputDialog("give me a number");
		int numbers = Integer.parseInt(number);
		String number2 = JOptionPane.showInputDialog("give me a number");
		int numbers2 = Integer.parseInt(number);
		int operation = JOptionPane.showOptionDialog(null, "calculater", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "multiply", "divide", "add", "subtract" }, null);
		System.out.println(operation);
		if (operation == 2) {
			addition(numbers, numbers2);
		}
		if (operation == 0) {
			multiply(numbers, numbers2);
		}
		if (operation == 1) {
			division(numbers, numbers2);
		}
		if (operation == 3) {
			subtraction(numbers, numbers2);
		}
	}
	public static void addition(int a, int b) {
		JOptionPane.showMessageDialog(null, a + " + " + b + " = " + (a + b));
	}
	public static void multiply(int a, int b) {
		JOptionPane.showMessageDialog(null, a + " X " + b + " = " + (a * b));
	}
	public static void division(int a, int b) {
		JOptionPane.showMessageDialog(null, a + " / " + b + " = " + (a / b));
	}
		public static void subtraction(int a, int b) {
			JOptionPane.showMessageDialog(null, a + " - " + b + " = "  + (a - b));
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	// 4. Create similar methods for subtraction, multiplication and division.
}