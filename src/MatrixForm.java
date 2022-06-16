import javax.swing.*;
import java.awt.*;

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

    public MatrixForm() {

        this.setTitle("Calculate matrix program");
        this.setContentPane(matrixPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(700, 500);
        this.setResizable(true);
        this.pack();

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
                                    (matrix3[0][1] * matrix3[1][3] * matrix3[3][0]) +
                                    (matrix3[1][0] * matrix3[2][1] * matrix3[0][2]))
                                    -
                                    ((matrix3[0][3] * matrix3[1][1] * matrix3[2][0]) +
                                            (matrix3[0][1] * matrix3[1][0] * matrix3[2][2] +
                                                    (matrix3[0][0] * matrix3[1][2] * matrix3[2][1])))
                    ));
                } catch (NumberFormatException exception) {
                    answerTextArea.setText("Fill ur matrix please");
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
        });

        threeOnThreeButton.addActionListener(e -> {
            mas13.setVisible(true);
            mas23.setVisible(true);
            mas13.setVisible(true);
            mas31.setVisible(true);
            mas32.setVisible(true);
            mas33.setVisible(true);
        });

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
        matrixPanel.add(answerTextArea, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 3, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        mas11 = new JTextField();
        matrixPanel.add(mas11, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas21 = new JTextField();
        matrixPanel.add(mas21, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas31 = new JTextField();
        mas31.setVisible(true);
        matrixPanel.add(mas31, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        calculateButton = new JButton();
        calculateButton.setText("Calculate");
        matrixPanel.add(calculateButton, new com.intellij.uiDesigner.core.GridConstraints(3, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        twoOnTwoButton = new JButton();
        twoOnTwoButton.setText("2 x 2");
        matrixPanel.add(twoOnTwoButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mas32 = new JTextField();
        mas32.setVisible(true);
        matrixPanel.add(mas32, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas22 = new JTextField();
        matrixPanel.add(mas22, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas12 = new JTextField();
        matrixPanel.add(mas12, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        threeOnThreeButton = new JButton();
        threeOnThreeButton.setText("3 x 3");
        matrixPanel.add(threeOnThreeButton, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mas23 = new JTextField();
        mas23.setVisible(true);
        matrixPanel.add(mas23, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas13 = new JTextField();
        mas13.setVisible(true);
        matrixPanel.add(mas13, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        mas33 = new JTextField();
        mas33.setVisible(true);
        matrixPanel.add(mas33, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(40, -1), null, 0, false));
        clearButton = new JButton();
        clearButton.setText("Clear matrix");
        matrixPanel.add(clearButton, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return matrixPanel;
    }

}
