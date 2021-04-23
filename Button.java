/***
 * Class: Button
 * This class is create two function button for the calculator.
 * Scientific Mode is expand the calculation to such as root, log.
 * Change Color mode is to change the color theme to a more interesting one.
 */

import javax.swing.*;
import java.awt.*;

public class Button extends Parameter {
    //Button which is the main part of a calculator
    public JButton
            btnC, btnBack, btnMod, btnDiv, btn7, btn8, btn9,
            btnMul, btn4, btn5, btn6, btnSub, btn1, btn2, btn3, btnAdd, btnPoint,
            btn0, btn00, btnEqual, btnRoot, btnPower, btnLog, btnSwitchToTheDifferentColorMode, btnSwitchToScientificMode;
    //Two states to judge the two special button.
    private boolean isChangeColorSelected = false;
    private boolean isScientificMode = false;

    // Button fonts
    Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 56);
    Font smallTxtBtnFont = new Font("Comic Sans MS", Font.PLAIN, 48);
    Font btnSwitchFont = new Font("Comic Sans MS", Font.PLAIN, 30);
//    Font smallTxtBtnFont = new Font("Comic Sans MS", Font.PLAIN, 48);

    Music music = new Music();


    public Button() {
        myBtnSwitchToTheDifferentColorMode();
        myBtnSwitchToScientificMode();
    }


    /***
     *  Change colors
     */
    public void myBtnSwitchToTheDifferentColorMode() {
        btnSwitchToTheDifferentColorMode = new JButton();
        btnSwitchToTheDifferentColorMode.setBounds(460, 30, 280, 70);
        btnSwitchToTheDifferentColorMode.setText("Change colors");
        btnSwitchToTheDifferentColorMode.setFont(btnSwitchFont);
        btnSwitchToTheDifferentColorMode.setBackground(Color.BLUE.darker());
        btnSwitchToTheDifferentColorMode.setForeground(Color.WHITE);
        btnSwitchToTheDifferentColorMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSwitchToTheDifferentColorMode.addActionListener(event -> onShowTheDifferentColorMode());


    }

    /***
     * Change to Scientific Mode
     */
    public void myBtnSwitchToScientificMode() {
        btnSwitchToScientificMode = new JButton();
        btnSwitchToScientificMode.setBounds(60, 30, 280, 70);
        btnSwitchToScientificMode.setText("Scientific Mode");
        btnSwitchToScientificMode.setFont(btnSwitchFont);
        btnSwitchToScientificMode.setBackground(Color.BLUE.darker());
        btnSwitchToScientificMode.setForeground(Color.WHITE);
        btnSwitchToScientificMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSwitchToScientificMode.addActionListener(event -> onShowScientificMode(window));

    }

    /***
     * Different color Mode!
     */
    public void onShowTheDifferentColorMode() {
        if (isChangeColorSelected) {
            btnSwitchToTheDifferentColorMode.setText("change colors");
            btnSwitchToTheDifferentColorMode.setBackground(Color.BLUE.darker());
            btnSwitchToTheDifferentColorMode.setForeground(Color.WHITE);

            btnC.setBackground(null);
            btnBack.setBackground(null);
            btnMod.setBackground(null);
            btnDiv.setBackground(null);
            btnMul.setBackground(null);
            btnSub.setBackground(null);
            btnAdd.setBackground(null);
            btnRoot.setBackground(null);
            btnLog.setBackground(null);
            btnPower.setBackground(null);
            btnEqual.setBackground(null);
            btn0.setBackground(null);
            btn00.setBackground(null);
            btn1.setBackground(null);
            btn2.setBackground(null);
            btn3.setBackground(null);
            btn4.setBackground(null);
            btn5.setBackground(null);
            btn6.setBackground(null);
            btn7.setBackground(null);
            btn8.setBackground(null);
            btn9.setBackground(null);
            btnPoint.setBackground(null);
            btnC.setForeground(Color.BLACK);
            btnBack.setForeground(Color.BLACK);
            btnMod.setForeground(Color.BLACK);
            btnDiv.setForeground(Color.BLACK);
            btnMul.setForeground(Color.BLACK);
            btnSub.setForeground(Color.BLACK);
            btnAdd.setForeground(Color.BLACK);
            btnEqual.setForeground(Color.BLACK);
            btnLog.setForeground(Color.BLACK);
            btnPower.setForeground(Color.BLACK);
            btnRoot.setForeground(Color.BLACK);

            isChangeColorSelected = false;
        } else {

            btnSwitchToTheDifferentColorMode.setText("Unchange colors");
            btnSwitchToTheDifferentColorMode.setBackground(null);
            btnSwitchToTheDifferentColorMode.setForeground(Color.BLACK);
            music.end(1);
            music.start(2);
            music.loop(1);

            btnC.setBackground(Color.RED);
            btnBack.setBackground(Color.ORANGE);
            btnMod.setBackground(Color.YELLOW);
            btnDiv.setBackground(Color.GREEN);
            btnMul.setBackground(Color.GREEN);
            btnSub.setBackground(Color.GREEN);
            btnAdd.setBackground(Color.GREEN);
            btnRoot.setBackground(Color.PINK);
            btnLog.setBackground(Color.PINK);
            btnPower.setBackground(Color.PINK);
            btnEqual.setBackground(Color.BLUE);
            btn0.setBackground(Color.BLUE);
            btn00.setBackground(Color.BLUE);
            btn1.setBackground(Color.RED);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.YELLOW);
            btn4.setBackground(Color.RED);
            btn5.setBackground(Color.ORANGE);
            btn6.setBackground(Color.YELLOW);
            btn7.setBackground(Color.RED);
            btn8.setBackground(Color.ORANGE);
            btn9.setBackground(Color.YELLOW);
            btnPoint.setBackground(Color.BLUE);

            btnC.setForeground(Color.WHITE);
            btnBack.setForeground(Color.WHITE);

            btnC.setForeground(Color.BLACK);
            btnBack.setForeground(Color.BLACK);
            btnMod.setForeground(Color.BLACK);
            btnDiv.setForeground(Color.BLACK);
            btnMul.setForeground(Color.BLACK);
            btnSub.setForeground(Color.BLACK);
            btnAdd.setForeground(Color.BLACK);
            btnEqual.setForeground(Color.BLACK);
            btnLog.setForeground(Color.BLACK);
            btnPower.setForeground(Color.BLACK);
            btnRoot.setForeground(Color.BLACK);
            isChangeColorSelected = true;
        }
    }

    /***
     * Scientific Mode!
     * @param window : the main window
     */
    public void onShowScientificMode(JFrame window) {
        if (isScientificMode) {
            window.setSize(Calculator.WINDOW_WIDTH, Calculator.WINDOW_HEIGHT);
            btnRoot.setVisible(false);
            btnPower.setVisible(false);
            btnLog.setVisible(false);
            isScientificMode = false;
        } else {
            music.end(1);
            music.start(2);
            music.loop(1);
            window.setSize(Calculator.WINDOW_WIDTH + 160, Calculator.WINDOW_HEIGHT);
            btnRoot.setVisible(true);
            btnPower.setVisible(true);
            btnLog.setVisible(true);
            isScientificMode = true;
        }
    }


}
