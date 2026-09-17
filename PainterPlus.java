import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Turns around to face the opposite direction
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  // Takes all of the paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Moves and paints while the Painter can move forward
  public void moveAndPaint(String color) {
    while (canMove()) {
      if (isOnBucket()) {
        takeAllPaint();
      }

      if (hasPaint()) {
        paint(color);
      }

      move();
    }

    if (isOnBucket()) {
      takeAllPaint();
    }

    if (hasPaint()) {
      paint(color);
    }
  }

  public void paintBorder(String color) {
    turnRight();
    move();
    move();
    move();
    paint(color);
  }
}
