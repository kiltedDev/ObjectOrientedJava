public class InterfacePleaser3 implements ArbitraryInterface {
  public double getNumber() {
    double d = Math.PI;
    d = Math.round(d*100000) / 10000;
    return d;
  }

  public void doSomething(int n) {
    n = Math.abs(n);
    for ( int i = n; i>0; i--) {
      if (i > 1) {
        System.out.print(i + " bottles of beer on the wall, ");
        System.out.println(i + " bottles of beer!");
        System.out.print("You take one down, pass it around, ");
        System.out.println(i-1 + " bottles of beer on the wall!");
        System.out.println();
      } else if ( i == 1) {
        System.out.print(i + " bottles of beer on the wall, ");
        System.out.println(i + " bottles of beer!");
        System.out.print("Take one down and pass it around, no more bottles of beer on the wall.");
        System.out.println();
      } else {
        System.out.println("No more bottles of beer on the wall, no more bottles of beer. ");
        System.out.print("Go to the store and buy some more, ");
        System.out.println(n + " bottles of beer on the wall.");
      }
    }
  }
}
