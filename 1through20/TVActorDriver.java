public class TVActorDriver {
  public static void main(String[] args) {
    TVActor a = new TVActor();
    a.name = "Thomas Middleditch";
    a.role = "Richard Hendricks";
    a.media = "Silicon Valley";

    TVActor b = new TVActor();
    b.name = "Martin Starr";
    b.role = "Bertram Gilfoyle";
    b.media = "Silicon Valley";

    TVActor c = new TVActor();
    c.name = "Kumail Nanjiani";
    c.role = "Dinesh Chugtai";
    c.media = "Silicon Valley";

    System.out.println(a.name + " played " + a.role + " in " + a.media);
    System.out.println(b.name + " played " + b.role + " in " + b.media);
    System.out.println(c.name + " played " + c.role + " in " + c.media);
  }
}
