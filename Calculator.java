import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {

        String calcOption = JOptionPane.showInputDialog("Please pick your option (1. adding, 2. subtracting, 3. dividing, 4. multiply)");
       
        if (calcOption.equals("1")) {
            // Adding
            JOptionPane.showMessageDialog(null, "You picked adding option!");

            int int1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your first digit: "));
            int int2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second digit: "));

            int addFinalInt = int1 + int2;
            JOptionPane.showMessageDialog(null, "= " + addFinalInt);

        } else if (calcOption.equals("2")) {
            // Subtracting
            JOptionPane.showMessageDialog(null, "You picked subtracting option!");

            int int1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your first digit: "));
            int int2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second digit: "));

            int addFinalInt = int1 - int2;
            JOptionPane.showMessageDialog(null, "= " + addFinalInt);

        } else if (calcOption.equals("3")) {
            // Dividing
            JOptionPane.showMessageDialog(null, "You picked dividing option!");

            int int1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your first digit: "));
            int int2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second digit: "));

            int addFinalInt = int1 / int2;
            JOptionPane.showMessageDialog(null, "= " + addFinalInt);

        } else if (calcOption.equals("4")) {
            // multiply
            JOptionPane.showMessageDialog(null, "You picked multiply option!");

            int int1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your first digit: "));
            int int2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second digit: "));

            int addFinalInt = int1 * int2;
            JOptionPane.showMessageDialog(null, "= " + addFinalInt);
        } else {
            // When user inputs an wrong option
            JOptionPane.showMessageDialog(null, "Sorry, wrong input...");

        }
    }
}