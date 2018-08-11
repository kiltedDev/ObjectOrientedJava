public class DoorDriver {
  public static void main(String[] args) {
    // AbstractDoor d1 = new AbstractDoor(true); // cannot be instantiated
    // BadDoor d2 = BadDoor(true); // WON'T COMPILE

    GoodDoor d3 = new GoodDoor(false);
    System.out.println(d3);
    System.out.println("\tSound-Proofing level: " + d3.soundProofing() );
    d3.open();
    System.out.println(d3);
    System.out.println("\tSound-Proofing level: " + d3.soundProofing() );

    AbstractDoor d4 = new GoodDoor(true);
    System.out.println(d4);
    System.out.println("\tSound-Proofing level: " + d4.soundProofing() );
  }
}
