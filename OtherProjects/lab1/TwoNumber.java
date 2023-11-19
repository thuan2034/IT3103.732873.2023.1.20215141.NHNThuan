import javax.swing.JOptionPane;

public class TwoNumber {
    public static void main(String[] args) {
        String strnum1, strnum2;
        strnum1 = JOptionPane.showInputDialog(null, "Input first number pls: ", "first number",
                JOptionPane.INFORMATION_MESSAGE);
        strnum2 = JOptionPane.showInputDialog(null, "Input second number pls: ", "second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strnum1);
        double num2 = Double.parseDouble(strnum2);
        System.out.println("Sum is: ");
        System.out.println(num1 + num2);
        System.out.println("Difference is: ");
        System.out.println(Math.abs(num1 - num2));
        System.out.println("Product is: ");
        System.out.println(num1 * num2);
        double Quotient = (num1 > num2) ? num1 / num2 : num2 / num1;
        System.out.println("Quotient is: ");
        System.out.println(Quotient);
        System.exit(0);
    }

}
