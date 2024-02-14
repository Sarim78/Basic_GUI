import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Ask Name
        String name = JOptionPane.showInputDialog("What is your name: ");
        JOptionPane.showMessageDialog(null, "Weclome " + name);

        // Ask Age
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age: "));
        JOptionPane.showMessageDialog(null, "Your age is:  " + age);

        // Ask Height
        int height = Integer.parseInt(JOptionPane.showInputDialog("What is your height: "));
        if(height < 125) {
            JOptionPane.showMessageDialog(null, "Your short as shit");
        } else if(height > 125 && height < 200) {
            JOptionPane.showMessageDialog(null, "Your not tall enough but its fine");
        } else if (height > 201) {
            JOptionPane.showMessageDialog(null, "Damn your tall as shit, but im taller ;)");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, wrong input");
        }

        JOptionPane.showMessageDialog(null, "Your name is " + name + " and your age is: " + age + " and your " + height + "cm tall!");
    }
}