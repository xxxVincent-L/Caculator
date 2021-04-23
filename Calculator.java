/***
 * class: Calculator
 * This is the main class
 * for the initialization of the main window
 * and the call for the two special button
 * and the call for the background music
 * and the call for the real action of calculation!
 */

import javax.swing.*;

public class Calculator extends Action {



    public Calculator() {
        MyCalculator();
    }

    /***
     * The main method to call the other method!
     */
    private void MyCalculator() {
        // Main window
        window = new JFrame("Calculator By Vincent");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Set the width and the Height
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  Click to end The Process
        window.setLocationRelativeTo(null); // Move window to center of the screen

        //The background Music I put in here ,though it is not very suitable.
        music.loop(1);

        //The two special button
        new Button();
        window.add(btnSwitchToTheDifferentColorMode);
        window.add(btnSwitchToScientificMode);

        //Real action for the calculation!
        btnAction();

    }


    public static void main(String[] args) {
        new Calculator();
    }
}
