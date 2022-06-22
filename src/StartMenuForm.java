import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class StartMenuForm extends JFrame {
    private JButton matrixButton;
    private JButton calculatorButton;
    private JPanel menuPanel;
    private JTextField textField;

    public StartMenuForm() {
        $$$setupUI$$$();
        this.setTitle("Menu");
        this.setContentPane(menuPanel);
        this.setLocation(800, 450);
        this.setResizable(false);
        this.setDefaultCloseOperation();
        this.pack();

        textField.setEditable(false);

        matrixButton.setBackground(Color.BLACK);
        matrixButton.setForeground(Color.WHITE);
        calculatorButton.setBackground(Color.BLACK);
        calculatorButton.setForeground(Color.WHITE);
        menuPanel.setBackground(Color.BLACK);
        textField.setBackground(Color.BLACK);
        textField.setSelectedTextColor(Color.WHITE);

        matrixButton.addActionListener(e -> {
            EventQueue.invokeLater(() -> {
                JFrame matrixFrame = new MatrixForm();
                matrixFrame.setVisible(true);
                matrixFrame.setExtendedState(JFrame.NORMAL);
            });
        });

        calculatorButton.addActionListener(e -> {
            EventQueue.invokeLater(() -> {
                JFrame calculatorFrame = new CalculatorForm();
                calculatorFrame.setVisible(true);
                calculatorFrame.setExtendedState(JFrame.NORMAL);
            });
        });

//        this.addWindowListener(new WindowAdapter() {
//            public void windowClosing(Window event) {
//                int option = JOptionPane.showConfirmDialog(
//                        menuPanel,
//                        "U want exit?",
//                        "Close",
//                        JOptionPane.YES_NO_OPTION,
//                        JOptionPane.QUESTION_MESSAGE);
//                if (option == JOptionPane.YES_OPTION) {
//                    System.exit(0);
//                }
//            }
//        });

    }

    private void setDefaultCloseOperation() {
        JFrame exitFrame = new ExitDialogForm();
        exitFrame.setVisible(true);
        exitFrame.setExtendedState(JFrame.NORMAL);
    }


    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        menuPanel = new JPanel();
        menuPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        menuPanel.setMinimumSize(new Dimension(500, 300));
        menuPanel.setPreferredSize(new Dimension(300, 100));
        matrixButton = new JButton();
        matrixButton.setText("Matrix");
        menuPanel.add(matrixButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        calculatorButton = new JButton();
        calculatorButton.setText("Calculator");
        menuPanel.add(calculatorButton, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField = new JTextField();
        Font textFieldFont = this.$$$getFont$$$(null, -1, 32, textField.getFont());
        if (textFieldFont != null) textField.setFont(textFieldFont);
        textField.setText("Choose what u want");
        menuPanel.add(textField, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
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
        return menuPanel;
    }

}
