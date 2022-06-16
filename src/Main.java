import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {

        EventQueue.invokeLater(() -> {
            JFrame frame = new MatrixForm();
            frame.setVisible(true);
            frame.setExtendedState(JFrame.NORMAL);
        });

    }
}