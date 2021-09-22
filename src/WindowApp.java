import javax.swing.*;

public class WindowApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setTitle("Ruslan Zhedunov's centered 800x600 window");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
