package extra;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class PrimeOrNot {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog(
				"Give me a positive number between 1 and 999,999,999, then I will test if it is prime or not.");
		int num = Integer.parseInt(num1);
		if (num == 2) {
			JOptionPane.showMessageDialog(null, num1 + " is prime.");
			return;
		}
		if (num == 1) {
			JOptionPane.showMessageDialog(null, num1 + " is not prime.");
			return;
		}
		int max = (int) Math.sqrt(num) + 1;
		for (int i = 2; i < max; i++) {
			if (num % i == 0) {
				JOptionPane.showMessageDialog(null, num1 + " is not prime.");
				return;

			}

		}
		JOptionPane.showMessageDialog(null, num1 + " is prime.");

	}
}
