import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class MatrixForm extends JFrame {
    private JTextField mas11;
    private JTextField mas12;
    private JTextField mas13;
    private JTextField mas21;
    private JTextField mas22;
    private JTextField mas23;
    private JTextArea answerTextArea;
    private JButton calculateButton;
    private JPanel matrixPanel;
    private JButton clearButton;
    private JTextField mas31;
    private JTextField mas32;
    private JTextField mas33;
    private JButton twoOnTwoButton;
    private JButton threeOnThreeButton;

    final private int[][] matrix2 = new int[2][2];
    final private int[][] matrix3 = new int[3][3];

    public MatrixForm(boolean aboutTheme) throws FileNotFoundException {

        this.setTitle("Calculate matrix program");
        this.setContentPane(matrixPanel);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocation(700, 500);
        this.setResizable(true);
        this.pack();

        answerTextArea.setEditable(false);

        clearButton.addActionListener(e -> {
            mas11.setText(null);
            mas12.setText(null);
            mas13.setText(null);
            mas21.setText(null);
            mas22.setText(null);
            mas23.setText(null);
            mas31.setText(null);
            mas32.setText(null);
            mas33.setText(null);
            answerTextArea.setText(null);
        });

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!mas33.isVisible()) {
                        try {
                            matrix2[0][0] = Integer.parseInt(mas11.getText());
                            matrix2[0][1] = Integer.parseInt(mas12.getText());
                            matrix2[1][0] = Integer.parseInt(mas21.getText());
                            matrix2[1][1] = Integer.parseInt(mas22.getText());

                            answerTextArea.setText("Ur matrix: \n");

                            for (int i = 0; i < 2; i++) {
                                for (int j = 0; j < 2; j++)
                                    answerTextArea.setText(answerTextArea.getText() + matrix2[i][j] + " ");
                                answerTextArea.setText(answerTextArea.getText() + "\n");
                            }

                            answerTextArea.setText(answerTextArea.getText() + "Answer is: ");
                            answerTextArea.setText(answerTextArea.getText() + String.valueOf(
                                    (matrix2[0][0] * matrix2[1][1]) - (matrix2[0][1] * matrix2[1][0])));
                        } catch (NumberFormatException exception) {
                            answerTextArea.setText("Fill ur matrix please");
                        }
                    } else {
                        try {
                            matrix3[0][0] = Integer.parseInt(mas11.getText());
                            matrix3[0][1] = Integer.parseInt(mas12.getText());
                            matrix3[0][2] = Integer.parseInt(mas13.getText());
                            matrix3[1][0] = Integer.parseInt(mas21.getText());
                            matrix3[1][1] = Integer.parseInt(mas22.getText());
                            matrix3[1][2] = Integer.parseInt(mas23.getText());
                            matrix3[2][0] = Integer.parseInt(mas31.getText());
                            matrix3[2][1] = Integer.parseInt(mas32.getText());
                            matrix3[2][2] = Integer.parseInt(mas33.getText());

                            answerTextArea.setText("Ur matrix: \n");

                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++)
                                    answerTextArea.setText(answerTextArea.getText() + matrix3[i][j] + " ");
                                answerTextArea.setText(answerTextArea.getText() + "\n");
                            }

                            answerTextArea.setText(answerTextArea.getText() + "Answer is: ");
                            answerTextArea.setText(answerTextArea.getText() + String.valueOf(
                                    ((matrix3[0][0] * matrix3[1][1] * matrix3[2][2]) +
                                            (matrix3[0][1] * matrix3[1][2] * matrix3[2][0]) +
                                            (matrix3[1][0] * matrix3[2][1] * matrix3[0][2]))
                                            -
                                            ((matrix3[0][2] * matrix3[1][1] * matrix3[2][0]) +
                                                    (matrix3[0][1] * matrix3[1][0] * matrix3[2][2] +
                                                            (matrix3[0][0] * matrix3[1][2] * matrix3[2][1])))
                            ));
                        } catch (NumberFormatException exception) {
                            answerTextArea.setText("Fill ur matrix please");
                        }
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        calculateButton.addActionListener(e -> {
            if (!mas33.isVisible()) {
                try {
                    matrix2[0][0] = Integer.parseInt(mas11.getText());
                    matrix2[0][1] = Integer.parseInt(mas12.getText());
                    matrix2[1][0] = Integer.parseInt(mas21.getText());
                    matrix2[1][1] = Integer.parseInt(mas22.getText());

                    answerTextArea.setText("Ur matrix: \n");

                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++)
                            answerTextArea.setText(answerTextArea.getText() + matrix2[i][j] + " ");
                        answerTextArea.setText(answerTextArea.getText() + "\n");
                    }

                    answerTextArea.setText(answerTextArea.getText() + "Answer is: ");
                    answerTextArea.setText(answerTextArea.getText() + String.valueOf(
                            (matrix2[0][0] * matrix2[1][1]) - (matrix2[0][1] * matrix2[1][0])));
                } catch (NumberFormatException exception) {
                    answerTextArea.setText(answerTextArea.getText() + "Fill ur matrix right please");
                }
            } else {
                try {
                    matrix3[0][0] = Integer.parseInt(mas11.getText());
                    matrix3[0][1] = Integer.parseInt(mas12.getText());
                    matrix3[0][2] = Integer.parseInt(mas13.getText());
                    matrix3[1][0] = Integer.parseInt(mas21.getText());
                    matrix3[1][1] = Integer.parseInt(mas22.getText());
                    matrix3[1][2] = Integer.parseInt(mas23.getText());
                    matrix3[2][0] = Integer.parseInt(mas31.getText());
                    matrix3[2][1] = Integer.parseInt(mas32.getText());
                    matrix3[2][2] = Integer.parseInt(mas33.getText());

                    answerTextArea.setText("Ur matrix: \n");

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++)
                            answerTextArea.setText(answerTextArea.getText() + matrix3[i][j] + " ");
                        answerTextArea.setText(answerTextArea.getText() + "\n");
                    }

                    answerTextArea.setText(answerTextArea.getText() + "Answer is: ");
                    answerTextArea.setText(answerTextArea.getText() + String.valueOf(
                            ((matrix3[0][0] * matrix3[1][1] * matrix3[2][2]) +
                                    (matrix3[0][1] * matrix3[1][2] * matrix3[2][0]) +
                                    (matrix3[1][0] * matrix3[2][1] * matrix3[0][2]))
                                    -
                                    ((matrix3[0][2] * matrix3[1][1] * matrix3[2][0]) +
                                            (matrix3[0][1] * matrix3[1][0] * matrix3[2][2] +
                                                    (matrix3[0][0] * matrix3[1][2] * matrix3[2][1])))
                    ));
                } catch (NumberFormatException exception) {
                    answerTextArea.setText(answerTextArea.getText() + "Fill ur matrix right please");
                }
            }
        });

        twoOnTwoButton.addActionListener(e -> {
            mas13.setVisible(false);
            mas23.setVisible(false);
            mas13.setVisible(false);
            mas31.setVisible(false);
            mas32.setVisible(false);
            mas33.setVisible(false);

            mas12.setLocation(73, 0);
            mas21.setLocation(0, 40);
            mas22.setLocation(73, 40);
        });

        threeOnThreeButton.addActionListener(e -> {
            mas13.setVisible(true);
            mas23.setVisible(true);
            mas13.setVisible(true);
            mas31.setVisible(true);
            mas32.setVisible(true);
            mas33.setVisible(true);

            mas12.setLocation(73, 0);
            mas21.setLocation(0, 40);
            mas22.setLocation(73, 40);
        });

        if (aboutTheme) {
            this.setBlackTheme();
        } else {
            this.setWhiteTheme();
        }

    }

    private void setBlackTheme() {
        twoOnTwoButton.setBackground(Color.BLACK);
        twoOnTwoButton.setForeground(Color.WHITE);
        threeOnThreeButton.setBackground(Color.BLACK);
        threeOnThreeButton.setForeground(Color.WHITE);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        calculateButton.setBackground(Color.BLACK);
        calculateButton.setForeground(Color.WHITE);
        mas11.setBackground(Color.BLACK);
        mas12.setBackground(Color.BLACK);
        mas13.setBackground(Color.BLACK);
        mas21.setBackground(Color.BLACK);
        mas22.setBackground(Color.BLACK);
        mas23.setBackground(Color.BLACK);
        mas31.setBackground(Color.BLACK);
        mas32.setBackground(Color.BLACK);
        mas33.setBackground(Color.BLACK);
        mas11.setForeground(Color.WHITE);
        mas12.setForeground(Color.WHITE);
        mas13.setForeground(Color.WHITE);
        mas21.setForeground(Color.WHITE);
        mas22.setForeground(Color.WHITE);
        mas23.setForeground(Color.WHITE);
        mas31.setForeground(Color.WHITE);
        mas32.setForeground(Color.WHITE);
        mas33.setForeground(Color.WHITE);
        answerTextArea.setBackground(Color.BLACK);
        answerTextArea.setSelectedTextColor(Color.WHITE);
        matrixPanel.setBackground(Color.GRAY);
    }

    private void setWhiteTheme()  {
        twoOnTwoButton.setBackground(Color.WHITE);
        twoOnTwoButton.setForeground(Color.BLACK);
        threeOnThreeButton.setBackground(Color.WHITE);
        threeOnThreeButton.setForeground(Color.BLACK);
        clearButton.setBackground(Color.WHITE);
        clearButton.setForeground(Color.BLACK);
        calculateButton.setBackground(Color.WHITE);
        calculateButton.setForeground(Color.BLACK);
        mas11.setBackground(Color.WHITE);
        mas12.setBackground(Color.WHITE);
        mas13.setBackground(Color.WHITE);
        mas21.setBackground(Color.WHITE);
        mas22.setBackground(Color.WHITE);
        mas23.setBackground(Color.WHITE);
        mas31.setBackground(Color.WHITE);
        mas32.setBackground(Color.WHITE);
        mas33.setBackground(Color.WHITE);
        mas11.setForeground(Color.BLACK);
        mas12.setForeground(Color.BLACK);
        mas13.setForeground(Color.BLACK);
        mas21.setForeground(Color.BLACK);
        mas22.setForeground(Color.BLACK);
        mas23.setForeground(Color.BLACK);
        mas31.setForeground(Color.BLACK);
        mas32.setForeground(Color.BLACK);
        mas33.setForeground(Color.BLACK);
        answerTextArea.setBackground(Color.WHITE);
        answerTextArea.setSelectedTextColor(Color.BLACK);
        matrixPanel.setBackground(Color.WHITE);
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
        matrixPanel = new JPanel();
        matrixPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 5, new Insets(0, 0, 0, 0), -1, -1));
        matrixPanel.setPreferredSize(new Dimension(400, 150));
        answerTextArea = new JTextArea();
        Font answerTextAreaFont = this.$$$getFont$$$(null, -1, 20, answerTextArea.getFont());
        if (answerTextAreaFont != null) answerTextArea.setFont(answerTextAreaFont);
        matrixPanel.add(answerTextArea, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 3, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        mas11 = new JTextField();
        Font mas11Font = this.$$$getFont$$$(null, -1, 20, mas11.getFont());
        if (mas11Font != null) mas11.setFont(mas11Font);
        matrixPanel.add(mas11, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), new Dimension(40, -1), 0, false));
        mas21 = new JTextField();
        Font mas21Font = this.$$$getFont$$$(null, -1, 20, mas21.getFont());
        if (mas21Font != null) mas21.setFont(mas21Font);
        matrixPanel.add(mas21, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), new Dimension(40, -1), 0, false));
        mas31 = new JTextField();
        Font mas31Font = this.$$$getFont$$$(null, -1, 20, mas31.getFont());
        if (mas31Font != null) mas31.setFont(mas31Font);
        mas31.setVisible(true);
        matrixPanel.add(mas31, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        calculateButton = new JButton();
        calculateButton.setText("Calculate");
        matrixPanel.add(calculateButton, new com.intellij.uiDesigner.core.GridConstraints(3, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        twoOnTwoButton = new JButton();
        twoOnTwoButton.setText("2 x 2");
        matrixPanel.add(twoOnTwoButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mas32 = new JTextField();
        Font mas32Font = this.$$$getFont$$$(null, -1, 20, mas32.getFont());
        if (mas32Font != null) mas32.setFont(mas32Font);
        mas32.setText("");
        mas32.setVisible(true);
        matrixPanel.add(mas32, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas22 = new JTextField();
        Font mas22Font = this.$$$getFont$$$(null, -1, 20, mas22.getFont());
        if (mas22Font != null) mas22.setFont(mas22Font);
        matrixPanel.add(mas22, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), new Dimension(40, -1), 0, false));
        mas12 = new JTextField();
        Font mas12Font = this.$$$getFont$$$(null, -1, 20, mas12.getFont());
        if (mas12Font != null) mas12.setFont(mas12Font);
        matrixPanel.add(mas12, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), new Dimension(40, -1), 0, false));
        threeOnThreeButton = new JButton();
        threeOnThreeButton.setText("3 x 3");
        matrixPanel.add(threeOnThreeButton, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mas23 = new JTextField();
        Font mas23Font = this.$$$getFont$$$(null, -1, 20, mas23.getFont());
        if (mas23Font != null) mas23.setFont(mas23Font);
        mas23.setVisible(true);
        matrixPanel.add(mas23, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas13 = new JTextField();
        Font mas13Font = this.$$$getFont$$$(null, -1, 20, mas13.getFont());
        if (mas13Font != null) mas13.setFont(mas13Font);
        mas13.setVisible(true);
        matrixPanel.add(mas13, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas33 = new JTextField();
        Font mas33Font = this.$$$getFont$$$(null, -1, 20, mas33.getFont());
        if (mas33Font != null) mas33.setFont(mas33Font);
        mas33.setVisible(true);
        matrixPanel.add(mas33, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        clearButton = new JButton();
        clearButton.setText("Clear matrix");
        matrixPanel.add(clearButton, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
        return matrixPanel;
    }

}
