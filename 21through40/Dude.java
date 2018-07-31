public class Dude {
  private int age;
  private String name;
  private double mass;

  public Dude(String name, int age, double mass) {
    this.name = name;
    this.age = age;
    this.mass = mass;
  }

  public boolean equals(Object obj) {
    if ( obj == null) {
      return false;
    }
    Dude other = null;
    try {
      other = (Dude)obj;
    }
    catch ( ClassCastException e ) {
      return false;
    }
    double diff = Math.abs(this.mass - other.mass);
    return (this.age == other.age && this.name.equals(other.name) && diff <= 0.01 );
  }

  public String toString() {
    return name + " : " + age + " : " + mass;
  }
}
