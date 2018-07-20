public class Fish {
  private String name, color;
  private String[] colors = {"red", "blue"};
  private int id;
  private static int count=0;

  public Fish(String name) {
    this.name = name;
    count++;
    id=count;
    color=colors[(id%2)];
    // if (id%2 == 0) {
    //   color = "red";
    // } else {
    //   color = "blue";
    // }
  }

  public String toString() {
    return name + ", a " + color + " fish, #" + id + " of " + count;
  }

  public static int numCreated() {
    return count;
  }
}
