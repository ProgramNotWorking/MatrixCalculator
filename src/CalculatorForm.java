import Calculation.CalculatorThings;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorForm extends JFrame {
    private JTextField expressionField;
    private JButton number1;
    private JButton number4;
    private JButton number2;
    private JButton number3;
    private JButton number5;
    private JButton number6;
    private JButton number7;
    private JButton number8;
    private JButton number9;
    private JButton number0;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton clearButton;
    private JButton divideButton;
    private JButton equalsButton;
    private JPanel calculatorPanel;

    public CalculatorForm() throws FileNotFoundException {
        this.setTitle("Calculator");
        this.setContentPane(calculatorPanel);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocation(800, 450);
        this.setSize(500, 650);
        this.setResizable(true);
        this.pack();

        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_1:
                        expressionField.setText(expressionField.getText() + "1");
                    case KeyEvent.VK_2:
                        expressionField.setText(expressionField.getText() + "2");
                    case KeyEvent.VK_3:
                        expressionField.setText(expressionField.getText() + "3");
                    case KeyEvent.VK_4:
                        expressionField.setText(expressionField.getText() + "4");
                    case KeyEvent.VK_5:
                        expressionField.setText(expressionField.getText() + "5");
                    case KeyEvent.VK_6:
                        expressionField.setText(expressionField.getText() + "6");
                    case KeyEvent.VK_7:
                        expressionField.setText(expressionField.getText() + "7");
                    case KeyEvent.VK_8:
                        expressionField.setText(expressionField.getText() + "8");
                    case KeyEvent.VK_9:
                        expressionField.setText(expressionField.getText() + "9");
                    case KeyEvent.VK_0:
                        expressionField.setText(expressionField.getText() + "0");
                    case KeyEvent.VK_MINUS:
                        expressionField.setText(expressionField.getText() + " - ");
                    case KeyEvent.VK_PLUS:
                        expressionField.setText(expressionField.getText() + " + ");
                    case KeyEvent.VK_SEPARATOR:
                        expressionField.setText(expressionField.getText() + " / ");
                    case KeyEvent.VK_EQUALS:
                        CalculatorThings calculator = new CalculatorThings(expressionField.getText());
                        calculator.setStringArray();
                        expressionField.setText(null);

                        if (calculator.getSecondNumber() == 0 && calculator.getSign().equals("/")) {
                            expressionField.setText("Дурак?");
                        } else if (expressionField.getText() == null) {
                            expressionField.setText("Enter expression");
                        } else {
                            expressionField.setText(Double.toString(calculator.calculationProcess()));
                        }
                        break;
                    default:

                }
            }

        });

        number1.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "1");
        });

        number2.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "2");
        });

        number3.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "3");
        });

        number4.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "4");
        });

        number5.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "5");
        });

        number6.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "6");
        });

        number7.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "7");
        });

        number8.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "8");
        });

        number9.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "9");
        });

        number0.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + "0");
        });

        plusButton.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + " + ");
        });

        minusButton.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + " - ");
        });

        multiplyButton.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + " * ");
        });

        divideButton.addActionListener(e -> {
            expressionField.setText(expressionField.getText() + " / ");
        });

        clearButton.addActionListener(e -> {
            expressionField.setText(null);
        });

        equalsButton.addActionListener(e -> {

            CalculatorThings calculator = new CalculatorThings(expressionField.getText());
            calculator.setStringArray();
            expressionField.setText(null);

            if (calculator.getSecondNumber() == 0 && calculator.getSign().equals("/")) {
                expressionField.setText("Дурак?");
            } else if (expressionField.getText() == null) {
                expressionField.setText("Enter expression");
            } else {
                expressionField.setText(Double.toString(calculator.calculationProcess()));
            }

        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    CalculatorThings calculator = new CalculatorThings(expressionField.getText());
                    calculator.setStringArray();
                    expressionField.setText(null);

                    if (calculator.getSecondNumber() == 0 && calculator.getSign().equals("/")) {
                        expressionField.setText("Error");
                    } else if (expressionField.getText() == null) {
                        expressionField.setText("Enter expression");
                    } else {
                        expressionField.setText(Double.toString(calculator.calculationProcess()));
                    }

                }

            }
        });

        String path = "C:\\Users\\Ve7te\\IdeaProjects\\Matrix\\src\\InfoAboutTheme";
        File themeFile = new File(path);
        Scanner scanner = new Scanner(themeFile);

        if (scanner.nextLine().equalsIgnoreCase("selected")) {
            setBlackTheme();
        } else {
            setWhiteTheme();
        }

    }

    public void setBlackTheme() {
        number0.setBackground(Color.BLACK);
        number0.setForeground(Color.WHITE);
        number1.setBackground(Color.BLACK);
        number1.setForeground(Color.WHITE);
        number2.setBackground(Color.BLACK);
        number2.setForeground(Color.WHITE);
        number3.setBackground(Color.BLACK);
        number3.setForeground(Color.WHITE);
        number4.setBackground(Color.BLACK);
        number4.setForeground(Color.WHITE);
        number5.setBackground(Color.BLACK);
        number5.setForeground(Color.WHITE);
        number6.setBackground(Color.BLACK);
        number6.setForeground(Color.WHITE);
        number7.setBackground(Color.BLACK);
        number7.setForeground(Color.WHITE);
        number8.setBackground(Color.BLACK);
        number8.setForeground(Color.WHITE);
        number9.setBackground(Color.BLACK);
        number9.setForeground(Color.WHITE);
        plusButton.setBackground(Color.BLACK);
        plusButton.setForeground(Color.WHITE);
        minusButton.setBackground(Color.BLACK);
        minusButton.setForeground(Color.WHITE);
        divideButton.setBackground(Color.BLACK);
        divideButton.setForeground(Color.WHITE);
        multiplyButton.setBackground(Color.BLACK);
        multiplyButton.setForeground(Color.WHITE);
        equalsButton.setBackground(Color.BLACK);
        equalsButton.setForeground(Color.WHITE);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        calculatorPanel.setBackground(Color.GRAY);
        expressionField.setBackground(Color.BLACK);
        expressionField.setSelectedTextColor(Color.WHITE);
    }

    private void setWhiteTheme() {
        number0.setBackground(Color.WHITE);
        number1.setBackground(Color.WHITE);
        number2.setBackground(Color.WHITE);
        number3.setBackground(Color.WHITE);
        number4.setBackground(Color.WHITE);
        number5.setBackground(Color.WHITE);
        number6.setBackground(Color.WHITE);
        number7.setBackground(Color.WHITE);
        number8.setBackground(Color.WHITE);
        number9.setBackground(Color.WHITE);
        plusButton.setBackground(Color.WHITE);
        minusButton.setBackground(Color.WHITE);
        divideButton.setBackground(Color.WHITE);
        multiplyButton.setBackground(Color.WHITE);
        equalsButton.setBackground(Color.WHITE);
        clearButton.setBackground(Color.WHITE);
        expressionField.setBackground(Color.WHITE);
        calculatorPanel.setBackground(Color.WHITE);
        number0.setForeground(Color.BLACK);
        number1.setForeground(Color.BLACK);
        number2.setForeground(Color.BLACK);
        number3.setForeground(Color.BLACK);
        number4.setForeground(Color.BLACK);
        number5.setForeground(Color.BLACK);
        number6.setForeground(Color.BLACK);
        number7.setForeground(Color.BLACK);
        number8.setForeground(Color.BLACK);
        number9.setForeground(Color.BLACK);
        plusButton.setForeground(Color.BLACK);
        minusButton.setForeground(Color.BLACK);
        divideButton.setForeground(Color.BLACK);
        multiplyButton.setForeground(Color.BLACK);
        equalsButton.setForeground(Color.BLACK);
        clearButton.setForeground(Color.BLACK);
        expressionField.setSelectedTextColor(Color.BLACK);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        calculatorPanel = new JPanel();
        calculatorPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 4, new Insets(0, 0, 0, 0), -1, -1));
        number4 = new JButton();
        Font number4Font = this.$$$getFont$$$(null, -1, 24, number4.getFont());
        if (number4Font != null) number4.setFont(number4Font);
        number4.setText("4");
        calculatorPanel.add(number4, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        number2 = new JButton();
        Font number2Font = this.$$$getFont$$$(null, -1, 24, number2.getFont());
        if (number2Font != null) number2.setFont(number2Font);
        number2.setText("2");
        calculatorPanel.add(number2, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        number3 = new JButton();
        Font number3Font = this.$$$getFont$$$(null, -1, 24, number3.getFont());
        if (number3Font != null) number3.setFont(number3Font);
        number3.setText("3");
        calculatorPanel.add(number3, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        number6 = new JButton();
        Font number6Font = this.$$$getFont$$$(null, -1, 24, number6.getFont());
        if (number6Font != null) number6.setFont(number6Font);
        number6.setText("6");
        calculatorPanel.add(number6, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        plusButton = new JButton();
        Font plusButtonFont = this.$$$getFont$$$(null, -1, 24, plusButton.getFont());
        if (plusButtonFont != null) plusButton.setFont(plusButtonFont);
        plusButton.setText("+");
        calculatorPanel.add(plusButton, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        minusButton = new JButton();
        Font minusButtonFont = this.$$$getFont$$$(null, -1, 24, minusButton.getFont());
        if (minusButtonFont != null) minusButton.setFont(minusButtonFont);
        minusButton.setText("-");
        calculatorPanel.add(minusButton, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        multiplyButton = new JButton();
        Font multiplyButtonFont = this.$$$getFont$$$(null, -1, 24, multiplyButton.getFont());
        if (multiplyButtonFont != null) multiplyButton.setFont(multiplyButtonFont);
        multiplyButton.setText("*");
        calculatorPanel.add(multiplyButton, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clearButton = new JButton();
        Font clearButtonFont = this.$$$getFont$$$(null, -1, 24, clearButton.getFont());
        if (clearButtonFont != null) clearButton.setFont(clearButtonFont);
        clearButton.setText("AC");
        calculatorPanel.add(clearButton, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        divideButton = new JButton();
        Font divideButtonFont = this.$$$getFont$$$(null, -1, 24, divideButton.getFont());
        if (divideButtonFont != null) divideButton.setFont(divideButtonFont);
        divideButton.setText("/");
        calculatorPanel.add(divideButton, new com.intellij.uiDesigner.core.GridConstraints(4, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        number7 = new JButton();
        Font number7Font = this.$$$getFont$$$(null, -1, 24, number7.getFont());
        if (number7Font != null) number7.setFont(number7Font);
        number7.setText("7");
        calculatorPanel.add(number7, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        number8 = new JButton();
        Font number8Font = this.$$$getFont$$$(null, -1, 24, number8.getFont());
        if (number8Font != null) number8.setFont(number8Font);
        number8.setText("8");
        calculatorPanel.add(number8, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        number9 = new JButton();
        Font number9Font = this.$$$getFont$$$(null, -1, 24, number9.getFont());
        if (number9Font != null) number9.setFont(number9Font);
        number9.setText("9");
        calculatorPanel.add(number9, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        equalsButton = new JButton();
        Font equalsButtonFont = this.$$$getFont$$$(null, -1, 24, equalsButton.getFont());
        if (equalsButtonFont != null) equalsButton.setFont(equalsButtonFont);
        equalsButton.setText("=");
        calculatorPanel.add(equalsButton, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        number0 = new JButton();
        Font number0Font = this.$$$getFont$$$(null, -1, 26, number0.getFont());
        if (number0Font != null) number0.setFont(number0Font);
        number0.setText("0");
        calculatorPanel.add(number0, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        number5 = new JButton();
        Font number5Font = this.$$$getFont$$$(null, -1, 24, number5.getFont());
        if (number5Font != null) number5.setFont(number5Font);
        number5.setText("5");
        calculatorPanel.add(number5, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        expressionField = new JTextField();
        Font expressionFieldFont = this.$$$getFont$$$(null, -1, 32, expressionField.getFont());
        if (expressionFieldFont != null) expressionField.setFont(expressionFieldFont);
        expressionField.setInheritsPopupMenu(true);
        expressionField.setSelectedTextColor(new Color(-1973791));
        expressionField.setSelectionColor(new Color(-1));
        calculatorPanel.add(expressionField, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        number1 = new JButton();
        Font number1Font = this.$$$getFont$$$(null, -1, 24, number1.getFont());
        if (number1Font != null) number1.setFont(number1Font);
        number1.setText("1");
        calculatorPanel.add(number1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return calculatorPanel;
    }

}
