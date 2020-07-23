import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.

    int rectangles = 4;
    int edge = 200;
    int sizeChange = edge / rectangles;

    for (int i = 0; i < rectangles; i++) {
      edge -= sizeChange;
      graphics.setColor(getRandomColor());
      drawRectangles(graphics,edge);
    }

  }
  public static void drawRectangles(Graphics graphics, int edge){
    graphics.fillRect(WIDTH/2,HEIGHT/2,edge,edge);
  }

  public static Color getRandomColor() {
    Random random = new Random();
    int limit = 256;
    return new Color(random.nextInt(limit), random.nextInt(limit), random.nextInt(limit));
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}