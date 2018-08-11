import java.util.Scanner;

public class DropGameConsole {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    String p = "○";
    DropGameHelper game = new DropGameHelper(6,7);
    int col;

    while ( !(game.isWinner("○")||game.isWinner("●")||game.isFull()) ) {
      System.out.println(game);
      System.out.println("'" + p + "', choose your column: ");
      col = keyboard.nextInt();

      while ( ! game.isValid(col) || game.isFull(col) ) {
        if ( game.isValid(col) == false ) {
          System.out.println("Not a valid location.  Try again.");
        } else {
          System.out.println("That column is full.  Try again.");
        }

        System.out.println("Choose your column: ");
        col = keyboard.nextInt();
      }
      game.playMove(p,col);

      if ( p.equals("○") ) {
        p = "●";
      } else {
        p = "○";
      }
    }

    System.out.println(game);

    if ( game.isWinner("○") ) {
      System.out.println("○ is the winner!");
    } else if ( game.isWinner("●") ) {
      System.out.println("● is the winner!");
    } else if (game.isFull() ) {
      System.out.println("The game is a tie.");
    }
  }

}
