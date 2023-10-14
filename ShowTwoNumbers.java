import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotifcation = "You've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotifcation += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotifcation += strNum2;
        JOptionPane.showMessageDialog(null, strNotifcation, "show two number", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}