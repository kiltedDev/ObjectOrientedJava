public class DudeDriver {
  public static void main( String[] args) {
    Dude one = new Dude("Mitch", 39, 88.8);
    Dude two = new Dude("Mitch", 39, 88.79);
    Dude three = one;
    Dude four = new Dude("Curly", 71, 102.02);

    if (one.equals(two)) {
      System.out.println(one + " equals " + two);
    } else {
      System.out.println(one + " does not equal " + two);
    }

    if (one.equals(three)) {
      System.out.println(one + " equals " + three);
    } else {
      System.out.println(one + " does not equal " + three);
    }

    if (one.equals(four)) {
      System.out.println(one + " equals " + four);
    } else {
      System.out.println(one + " does not equal " + four);
    }

    System.out.println();
    if (one == two) {
      System.out.println(one + " == " + two);
    } else {
      System.out.println(one + " != " + two);
    }

    if (one == three) {
      System.out.println(one + " == " + three);
    } else {
      System.out.println(one + " != " + three);
    }

    if (one == four) {
      System.out.println(one + " == " + four);
    } else {
      System.out.println(one + " != " + four);
    }
  }
}
