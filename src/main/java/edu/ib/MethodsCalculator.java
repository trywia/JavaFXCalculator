package edu.ib;

import javafx.scene.control.TextField;

public class MethodsCalculator {
    private static double number;
    private static String sign;
    private static String prevSign;
    private static double lastOperation;

    void onChangeSignClicked(TextField display) {
        String[] displayText = display.getText().split("");
        if (Double.parseDouble(display.getText()) != 0) {
            if (displayText[0].equals("-")) {
                String signText = "";
                for (int i = 1; i < displayText.length; i++) {
                    signText += displayText[i];
                }
                display.setText(signText);
            } else {
                display.setText("-" + display.getText());
            }
        }
    }

    void onAddClicked(TextField display) {
        if (number != 0) {
            double number1 = Double.parseDouble(display.getText());
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "+";
            display.setText("0");
        } else {
            number = Double.parseDouble(display.getText());
            sign = "+";
            display.setText("0");
        }
    }

    void onClearClicked(TextField display) {
        lastOperation = 0;
        number = 0;
        sign = "";
        display.setText("0");
    }

    void onDivideClicked(TextField display) {
        if (number != 0) {
            double number1 = Double.parseDouble(display.getText());
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "/";
            display.setText("0");
        } else {
            number = Double.parseDouble(display.getText());
            sign = "/";
            display.setText("0");
        }
    }

    void onDotClicked(TextField display) {
        String[] displayText = display.getText().split("");
        boolean flag = false;
        // check if there is no dot already
        for (int i = 0; i < displayText.length; i++) {
            if (displayText[i].equals(".")) {
                flag = true;
            }
        }
        // no dots
        if (!flag) {
            display.setText(display.getText() + ".");
        }
    }

    void onEightClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("8");
        } else {
            display.setText(display.getText() + "8");
        }
    }

    void onEqualClicked(TextField display) {
        double number1 = Double.parseDouble(display.getText());

        if (sign.equals("")) {

            // repeat last operation
            if (prevSign.equals("+")) {
                number += lastOperation;
                display.setText(Double.toString(number));
            } else if (prevSign.equals("-")) {
                number -= lastOperation;
                display.setText(Double.toString(number));
            } else if (prevSign.equals("*")) {
                number *= lastOperation;
                display.setText(Double.toString(number));
            } else if (prevSign.equals("/")) {
                number /= lastOperation;
                display.setText(Double.toString(number));
            }
            sign = prevSign;
        } else if (sign.equals("+")) {
            lastOperation = Double.parseDouble(display.getText());
            number += number1;
            display.setText(Double.toString(number));
        } else if (sign.equals("-")) {
            lastOperation = Double.parseDouble(display.getText());
            number -= number1;
            display.setText(Double.toString(number));
        } else if (sign.equals("*")) {
            lastOperation = Double.parseDouble(display.getText());
            number *= number1;
            display.setText(Double.toString(number));
        } else if (sign.equals("/")) {
            lastOperation = Double.parseDouble(display.getText());
            number /= number1;
            display.setText(Double.toString(number));
        }
        prevSign = sign;
        sign = "";
    }

    void onFiveClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("5");
        } else {
            display.setText(display.getText() + "5");
        }
    }

    void onFourClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("4");
        } else {
            display.setText(display.getText() + "4");
        }
    }

    void onMultiplyClicked(TextField display) {
        if (number != 0) {
            double number1 = Double.parseDouble(display.getText());
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "*";
            display.setText("0");
        } else {
            number = Double.parseDouble(display.getText());
            sign = "*";
            display.setText("0");
        }
    }

    void onNineClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("9");
        } else {
            display.setText(display.getText() + "9");
        }
    }

    void onOneClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("1");
        } else {
            display.setText(display.getText() + "1");
        }
    }

    void onPercentClicked(TextField display) {
        double number1 = Double.parseDouble(display.getText());
        number1 /= 100;
        display.setText(Double.toString(number1));
    }

    void onSevenClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("7");
        } else {
            display.setText(display.getText() + "7");
        }
    }

    void onSixClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("6");
        } else {
            display.setText(display.getText() + "6");
        }
    }

    void onSubtractClicked(TextField display) {
        if (number != 0) {
            double number1 = Double.parseDouble(display.getText());
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "-";
            display.setText("0");
        } else {
            number = Double.parseDouble(display.getText());
            sign = "-";
            display.setText("0");
        }
    }

    void onThreeClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("3");
        } else {
            display.setText(display.getText() + "3");
        }
    }

    void onTwoClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("2");
        } else {
            display.setText(display.getText() + "2");
        }
    }

    void onZeroClicked(TextField display) {
        if (display.getText().equals("0")) {
            display.setText("0");
        } else {
            display.setText(display.getText() + "0");
        }
    }
}
