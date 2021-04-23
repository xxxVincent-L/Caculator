/***
 * Class: Parameter
 * This class is to store some vital parameter which is useful in the whole project!
 *
 */

import javax.swing.*;

public class Parameter {
    // Basic information about this project!
    // ! -> Double (x)
    public static JFrame window;//The main window!
    public JTextField inputText; // Input text!
    public char operator = ' '; // Save the operator for the calculation
    public boolean judge = true; // For calculate with operator != (=)
    public boolean addWrite = true; // Number exists whether or not in the Display
    public double val = 0; // Save value typed for calculation
    // The information of the window and button!
    public static final int WINDOW_WIDTH = 820;
    public static final int WINDOW_HEIGHT = 1200;
    public static final int BUTTON_WIDTH = 160;
    public static final int BUTTON_HEIGHT = 140;
    //The structure of the whole window
    public int[] MARGIN_X = {40, 220, 400, 580, 760};
    public int[] MARGIN_Y = {120, 320, 480, 640, 800, 960};

}
