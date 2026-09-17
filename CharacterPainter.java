import org.code.neighborhood.*;

public class CharacterPainter extends PainterPlus {

  /*
   * Paints the whole character by calling the methods
   * that paint the top, middle, and bottom sections.
   */
  public void paintCharacter() {
    paintTop();
    paintMiddle();
    paintBottom();
  }

  /*
   * Paints the top part of the character including
   * the black outline, yellow face, eyes, and orange mouth.
   */
  public void paintTop() {

    // Moves the Painter to the starting position
    turnRight();
    move();
    move();
    move();

    turnLeft();
    move();
    move();
    move();
    move();

    // Paints the top black outline
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");

    // Moves down to paint the next row
    turnRight();
    move();
    turnRight();

    paint("black");
    move();
    paint("black");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("black");
    move();
    paint("black");

    // Turns around to paint the next row
    turnLeft();
    move();
    turnLeft();

    paint("black");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("black");

    // Paints the row with the black eyes
    turnRight();
    move();
    turnRight();

    paint("black");
    move();
    paint("yellow");
    move();
    paint("black");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("black");
    move();
    paint("yellow");
    move();
    paint("black");

    // Moves down and paints the row with the orange mouth
    turnLeft();
    move();
    turnLeft();

    paint("black");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("orange");
    move();
    paint("orange");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("black");
  }

  /*
   * Paints the middle section of the character
   * using the black outline and yellow body.
   */
  public void paintMiddle() {

    // Moves down and paints the first middle row
    turnRight();
    move();
    turnRight();

    paint("black");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("black");

    // Moves down and paints the second middle row
    turnLeft();
    move();
    turnLeft();

    paint("black");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("black");
  }

  /*
   * Paints the bottom section of the character
   * including the black outline and orange feet.
   */
  public void paintBottom() {

    // Paints the lower part of the body
    turnRight();
    move();
    turnRight();

    paint("black");
    move();
    paint("black");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("black");
    move();
    paint("black");

    // Moves down and paints the orange feet
    turnLeft();
    move();
    turnLeft();

    paint("orange");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("orange");
    move();
    move();
  }
}
