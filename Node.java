import javax.swing.*;
import java.awt.*;

// Node Structure
class Node {
    static int TEXT_WIDTH = 40;
    static int TEXT_HEIGHT = 40;

    JLabel data;
    Node left;
    Node right;
    Points p;

    Node(int info) {
        data = new JLabel(info + "", SwingConstants.CENTER);
        data.setFont(new Font("Arial", Font.BOLD, 20));
        data.setBorder(BorderFactory.createLineBorder(Color.black));
        data.setOpaque(true);
        data.setBackground(Color.green);
        p = null;
    }
}



