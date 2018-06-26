public class BetterTestingToms {
  public static void main(String[] args) {

    double[][] inputs = {
      {5, 314.159265359, 523.598775598},
      {0.1, 0.125663706, 4.18879E-3},
      {3.3, 136.84777599, 150.532553589},
      {20000, 5026548245.743669104, 3.3510321638291125E13},
      {8, 804.247719319, 2144.660584851}
    };
    int passed = 0;
    double r, a, v, A, V;

    SphereCalc4 c = new SphereCalc4(0);
    for (int i=0; i<inputs.length; i++) {
      r = inputs[i][0];
      a = inputs[i][1];
      v = inputs[i][2];

      c.setRadius(r);
      A = c.getSurfaceArea();
      V = c.getVolume();
      if ( isNear(A,a) ){
        passed++;
      } else {
        System.out.println("FAIL: surfaceArea fir radius " + r);
        System.out.println("-- Expected " + a + ", got " + A);
      }
      if ( isNear(V,v) ) {
        passed++;
      } else {
        System.out.println("FAIL: volume for radius " + r);
        System.out.println("-- Expected " + v + ", got " + V);
      }
    }
    if ( passed == 2*inputs.length) {
      System.out.println("PASS: All tests passed.");
    }
  }

  public static boolean isNear( double a, double b) {
    return Math.abs(a-b) < 1E-9;
  }
}
