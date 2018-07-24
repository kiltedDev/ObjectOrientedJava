public class Square extends Rect {
  public Square() {
    super();
  }

  public Square( double side ) {
    super(side, side);
  }

  public String toString() {
    return "Square, " + super.getLength() + "x" + super.getLength();
  }
}
