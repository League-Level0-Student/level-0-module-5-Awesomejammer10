package extra;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		String fib = JOptionPane.showInputDialog("How many numbers do you want in the fibonacci");
		System.out.println("1,\n1,");
		int fib1 = Integer.parseInt(fib);
		int num1 = 1;
		int num2 = 1;
		for (int i = 0; i < fib1; i++) {
			int sum = num1 + num2;
			System.out.println(sum + ",");
			num1 = num2;
			num2 = sum;
		}
	}
}
