import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {

        EventQueue.invokeLater(() -> {
            JFrame startFrame = null;
            try {
                startFrame = new StartMenuForm();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            startFrame.setVisible(true);
            startFrame.setExtendedState(JFrame.NORMAL);
        });

    }
}