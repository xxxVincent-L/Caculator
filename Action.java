/***
 * Class: Action
 * This class is the real calculating part of the calculation
 */

import java.awt.*;
import java.util.regex.Pattern;
import javax.swing.*;


public class Action extends Button {
    Action() {

    }

    //The main calling method
    public void btnAction() {
        text();

        btnc();

        btnBack();

        btnMod();

        btnDiv();

        btn7();

        btn8();

        btn9();

        btnMul();

        btn4();

        btn5();

        btn6();

        btnSub();

        btn1();

        btn2();

        btn3();

        btnAdd();

        btnPoint();

        btn0();

        btn00();

        btnEqual();

        btnRoot();

        btnPower();

        btnLog();


    }

    /***
     * The calculating method
     * @param x : the first operand
     * @param input : the number you input in the text
     * @param operator : the operator for calculating
     * @return :the value after calculating
     */
    public double calc(double x, String input, char operator) {
        inputText.setFont(inputText.getFont().deriveFont(Font.BOLD));
        double y = Double.parseDouble(input);
        if (operator == '+') {
            return x + y;
        } else if (operator == '-') {
            return x - y;
        } else if (operator == '*') {
            return x * y;
        } else if (operator == '/') {
            return x / y;
        } else if (operator == '%') {
            return x % y;
        } else if (operator == '^') {
            return Math.pow(x, y);
        }
        inputText.setFont(inputText.getFont().deriveFont(Font.PLAIN));
        return y;
    }

    /***
     * The button to do the Log!
     */
    public void btnLog() {
        btnLog = new JButton("log");
        btnLog.setBounds(MARGIN_X[4], MARGIN_Y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnLog.setFont(smallTxtBtnFont);
        btnLog.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLog.addActionListener(event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = Math.log(Double.parseDouble(inputText.getText()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }
                    operator = 'l';
                    addWrite = false;
                }
        });
        btnLog.setVisible(false);
        window.add(btnLog);

        window.setLayout(null);
        window.setResizable(false);
        window.setVisible(true);
    }

    /***
     * The button to do the Power!
     */
    public void btnPower() {
        btnPower = new JButton("pow");
        btnPower.setBounds(MARGIN_X[4], MARGIN_Y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnPower.setFont(smallTxtBtnFont);
        btnPower.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPower.addActionListener(event -> {
            repaintText();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = calc(val, inputText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }
                    operator = '^';
                    judge = false;
                    addWrite = false;
                } else {
                    operator = '^';
                }
        });
        btnPower.setVisible(false);
        window.add(btnPower);
    }

    /***
     * The button to do the Equal!
     */
    public void btnEqual() {
        btnEqual = new JButton("=");
        btnEqual.setBounds(MARGIN_X[3], MARGIN_Y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnEqual.setFont(btnFont);
        btnEqual.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnEqual.addActionListener(event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = calc(val, inputText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }
                    operator = '=';
                    addWrite = false;
                }
        });
        window.add(btnEqual);

    }

    /***
     * The button to do the Point!
     */
    public void btnPoint() {
        btnPoint = new JButton(".");
        btnPoint.setBounds(MARGIN_X[0], MARGIN_Y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnPoint.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        btnPoint.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPoint.addActionListener(event -> {
            repaintText();
            if (addWrite) {
                inputText.setText(inputText.getText() + ".");
            } else {
                inputText.setText("0.");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btnPoint);
    }

    /***
     * The button to do the 0!
     */
    public void btn0() {
        btn0 = new JButton("0");
        btn0.setBounds(MARGIN_X[1], MARGIN_Y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn0.setFont(btnFont);
        btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn0.addActionListener(event -> {
            repaintText();
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("0");
                } else {
                    inputText.setText(inputText.getText() + "0");
                }
            } else {
                inputText.setText("0");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn0);
    }

    /***
     * The button to do the 00!
     */
    public void btn00() {
        btn00 = new JButton("00");
        btn00.setBounds(MARGIN_X[2], MARGIN_Y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn00.setFont(btnFont);
        btn00.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn00.addActionListener(event -> {
            repaintText();
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("00");
                } else {
                    inputText.setText(inputText.getText() + "00");
                }
            } else {
                inputText.setText("00");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn00);
    }

    /***
     *
     */
    public void btn3() {
        btn3 = new JButton("3");
        btn3.setBounds(MARGIN_X[2], MARGIN_Y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn3.setFont(btnFont);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.addActionListener(event -> {
            repaintText();

            music.end(1);
            music.start(5);
            music.start(2);
            music.loop(1);

            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("3");
                } else {
                    inputText.setText(inputText.getText() + "3");
                }
            } else {
                inputText.setText("3");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn3);
    }

    /***
     * The button to do the root!
     */
    public void btnRoot() {
        btnRoot = new JButton("√");
        btnRoot.setBounds(MARGIN_X[4], MARGIN_Y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnRoot.setFont(btnFont);
        btnRoot.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRoot.addActionListener(event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = Math.sqrt(Double.parseDouble(inputText.getText()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }
                    operator = '√';
                    addWrite = false;
                }
        });
        btnRoot.setVisible(false);
        window.add(btnRoot);

    }

    /***
     * The button to do the Add!
     */
    public void btnAdd() {
        btnAdd = new JButton("+");
        btnAdd.setBounds(MARGIN_X[3], MARGIN_Y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnAdd.setFont(btnFont);
        btnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAdd.addActionListener(event -> {
            repaintText();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = calc(val, inputText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }
                    operator = '+';
                    judge = false;
                    addWrite = false;
                } else {
                    operator = '+';
                }
        });
        window.add(btnAdd);
    }

    /***
     * The button to do the Btn 2!
     */
    public void btn2() {
        btn2 = new JButton("2");
        btn2.setBounds(MARGIN_X[1], MARGIN_Y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn2.setFont(btnFont);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.addActionListener(event -> {
            repaintText();
            music.end(1);
            music.start(4);
            music.start(2);
            music.loop(1);
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("2");
                } else {
                    inputText.setText(inputText.getText() + "2");
                }
            } else {
                inputText.setText("2");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn2);
    }

    /***
     * The button to do the Btn 1!
     */
    public void btn1() {
        btn1 = new JButton("1");
        btn1.setBounds(MARGIN_X[0], MARGIN_Y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn1.setFont(btnFont);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.addActionListener(event -> {
            repaintText();
            music.end(1);
            music.start(3);
            music.start(2);
            music.loop(1);

            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("1");
                } else {
                    inputText.setText(inputText.getText() + "1");
                }
            } else {
                inputText.setText("1");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn1);
    }

    /***
     * The button to do the Subtract!
     */
    public void btnSub() {
        btnSub = new JButton("-");
        btnSub.setBounds(MARGIN_X[3], MARGIN_Y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnSub.setFont(btnFont);
        btnSub.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSub.addActionListener(event -> {
            repaintText();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = calc(val, inputText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }

                    operator = '-';
                    judge = false;
                    addWrite = false;
                } else {
                    operator = '-';
                }
        });
        window.add(btnSub);
    }

    /***
     * The button to do the 6!
     */
    public void btn6() {
        btn6 = new JButton("6");
        btn6.setBounds(MARGIN_X[2], MARGIN_Y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn6.setFont(btnFont);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn6.addActionListener(event -> {
            repaintText();
            music.end(1);
            music.start(8);
            music.start(2);
            music.loop(1);
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("6");
                } else {
                    inputText.setText(inputText.getText() + "6");
                }
            } else {
                inputText.setText("6");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn6);
    }

    /***
     * The button to do the 5!
     */
    public void btn5() {
        btn5 = new JButton("5");
        btn5.setBounds(MARGIN_X[1], MARGIN_Y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn5.setFont(btnFont);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.addActionListener(event -> {
            repaintText();
            music.end(1);
            music.start(7);
            music.start(2);
            music.loop(1);
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("5");
                } else {
                    inputText.setText(inputText.getText() + "5");
                }
            } else {
                inputText.setText("5");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn5);
    }

    /***
     * The button to do the 4!
     */
    public void btn4() {
        btn4 = new JButton("4");
        btn4.setBounds(MARGIN_X[0], MARGIN_Y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn4.setFont(btnFont);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.addActionListener(event -> {
            repaintText();
            music.end(1);
            music.start(6);
            music.start(2);
            music.loop(1);
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("4");
                } else {
                    inputText.setText(inputText.getText() + "4");
                }
            } else {
                inputText.setText("4");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn4);
    }

    /***
     * The button to do the multiple!
     */
    public void btnMul() {
        btnMul = new JButton("*");
        btnMul.setBounds(MARGIN_X[2], MARGIN_Y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnMul.setFont(btnFont);
        btnMul.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMul.addActionListener(event -> {
            repaintText();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = calc(val, inputText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }
                    operator = '*';
                    judge = false;
                    addWrite = false;
                } else {
                    operator = '*';
                }
        });
        window.add(btnMul);
    }

    /***
     * The button to do the 9!
     */
    public void btn9() {
        btn9 = new JButton("9");
        btn9.setBounds(MARGIN_X[2], MARGIN_Y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn9.setFont(btnFont);
        btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn9.addActionListener(event -> {
            repaintText();
            music.end(1);
            music.start(11);
            music.start(2);
            music.loop(1);
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("9");
                } else {
                    inputText.setText(inputText.getText() + "9");
                }
            } else {
                inputText.setText("9");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn9);
    }

    /***
     * The button to do the 8!
     */
    public void btn8() {
        btn8 = new JButton("8");
        btn8.setBounds(MARGIN_X[1], MARGIN_Y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn8.setFont(btnFont);
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.addActionListener(event -> {
            repaintText();
            music.end(1);
            music.start(10);
            music.start(2);
            music.loop(1);
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("8");
                } else {
                    inputText.setText(inputText.getText() + "8");
                }
            } else {
                inputText.setText("8");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn8);
    }

    /***
     * The button to do the 7!
     */
    public void btn7() {
        btn7 = new JButton("7");
        btn7.setBounds(MARGIN_X[0], MARGIN_Y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn7.setFont(btnFont);
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.addActionListener(event -> {
            repaintText();
            music.end(1);
            music.start(9);
            music.start(2);
            music.loop(1);
            if (addWrite) {
                if (Pattern.matches("[0]*", inputText.getText())) {
                    inputText.setText("7");
                } else {
                    inputText.setText(inputText.getText() + "7");
                }
            } else {
                inputText.setText("7");
                addWrite = true;
            }
            judge = true;
        });
        window.add(btn7);
    }

    /***
     * The button to do the division!
     */
    public void btnDiv() {
        btnDiv = new JButton("/");
        btnDiv.setBounds(MARGIN_X[3], MARGIN_Y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnDiv.setFont(btnFont);
        btnDiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDiv.addActionListener(event -> {
            repaintText();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = calc(val, inputText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }
                    operator = '/';
                    judge = false;
                    addWrite = false;
                } else {
                    operator = '/';
                }
        });
        window.add(btnDiv);
    }

    /***
     * The button to do the modification!
     */
    public void btnMod() {
        btnMod = new JButton("%");
        btnMod.setBounds(MARGIN_X[3], MARGIN_Y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnMod.setFont(btnFont);
        btnMod.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMod.addActionListener(event -> {
            repaintText();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inputText.getText()))
                if (judge) {
                    val = calc(val, inputText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inputText.setText(String.valueOf((int) val));
                    } else {
                        inputText.setText(String.valueOf(val));
                    }
                    operator = '%';
                    judge = false;
                    addWrite = false;
                }
        });
        window.add(btnMod);
    }

    /***
     * The button to do the back!
     */
    public void btnBack() {
        btnBack = new JButton("<-");
        btnBack.setBounds(MARGIN_X[1], MARGIN_Y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnBack.setFont(btnFont);
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBack.addActionListener(event -> {
            repaintText();
            String str = inputText.getText();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < (str.length() - 1); i++) {
                str2.append(str.charAt(i));
            }
            if (str2.toString().equals("")) {
                inputText.setText("0");
            } else {
                inputText.setText(str2.toString());
            }
        });
        window.add(btnBack);
    }

    /***
     * The button to do the clear!
     */
    public void btnc() {
        btnC = new JButton("C");
        btnC.setBounds(MARGIN_X[0], MARGIN_Y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnC.setFont(btnFont);
        btnC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnC.addActionListener(event -> {
            repaintText();
            inputText.setText("0");
            operator = ' ';
            val = 0;
        });
        window.add(btnC);
    }

    /***
     * To show the text .
     */
    public void text() {
        inputText = new JTextField("0");
        inputText.setBounds(MARGIN_X[0], MARGIN_Y[0], 700, 140);
        inputText.setEditable(false);
        inputText.setBackground(Color.WHITE);
        inputText.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        window.add(inputText);
    }

    /***
     * To repaint the text
     */
    public void repaintText() {
        inputText.setFont(inputText.getFont().deriveFont(Font.PLAIN));
    }
}
