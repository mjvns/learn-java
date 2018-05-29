import javax.swing.JOptionPane;
public class GUI1 {
    public static void main(String args[]){
        // Obtain user inputs from JOption Pane dialog boxes
        String firstNumber = JOptionPane.showInputDialog("Enter first number:");
        String secNumber = JOptionPane.showInputDialog("Enter second number:");

        // convert the strings into the corresponding integer values
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secNumber);

        int sum = num1+num2;

        //display result in a dialog box
        JOptionPane.showMessageDialog(null, "The Sum is: " + sum,"Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}
