package chapter3.create.graphical.user.interfaces.inputdialog;

// Obtaining user input from a dialog.
import javax.swing.JOptionPane;

/**
 *
 * @author jaguar
 */
public class InputDialog {

    public static void main(String[] args) {
// prompt user to enter name
        String name = JOptionPane.showInputDialog("What is your name?");
// create the message
        String message
                = String.format("Welcome, %s, to Java Programming!", name);
// display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
       

    }
}
