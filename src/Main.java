import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {

        EventQueue.invokeLater(() -> {
            JFrame startFrame = new StartMenuForm();
            startFrame.setVisible(true);
            startFrame.setExtendedState(JFrame.NORMAL);
        });

    }
}