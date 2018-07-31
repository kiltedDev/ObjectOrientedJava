import java.util.Scanner;
import static java.lang.System.out;

public class BreakthroughGame {
  public static void main( String[] args ) {
    BreakthroughBoard board = new BreakthroughBoard();
    Scanner kb = new Scanner(System.in);
    String col;
    int row, r, c, colDir;
    String player = "●";
    boolean goLeft, goForward, goRight;

    do {
      out.println("\n"+board);
      out.print("'" + player + "', your turn: ");
      col = kb.next().toUpperCase();
      row = kb.nextInt();

      r = 8-row;
      c = col.charAt(0) - 'A';

      BreakthroughPiece pick = board.get(r,c);
      if ( pick == null || ! pick.getSymbol().equals(player) ) {
        out.println("\nThere's no piece you can move there.  Try again.");
        continue;
      }

      goLeft = pick.canMove(-1);
      goForward = pick.canMove(0);
      goRight = pick.canMove(1);
      if ( !goLeft && !goForward && !goRight) {
        out.println("\nThat piece has no legal moves.  Try again.");
        continue;
      }

      out.println();
      do {
        if ( goLeft ) {
          out.println( "1) Move forward diagonally to the left." );
        }
        if ( goForward ) {
          out.println( "2) Move forward straight ahead." );
        }
        if ( goRight ) {
          out.println( "3) Move forward diagonally to the right.");
        }
        out.print("\nWhich move? ");
        colDir = kb.nextInt()-2;
        // it felt easier to just do the math here instead of each time colDir was called later.
        
        if ( ! pick.canMove(colDir) ) {
          out.println("\nThat wasn't one of the options.  Try again.");
        }
      } while ( ! pick.canMove(colDir) );

      pick.move(colDir);
      player = player.equals("●") ? "○" : "●";
    } while ( !board.isOver() );

    if (board.isWinner("●") ) {
      out.println("Player \"●\" wins!");
    } else {
      out.println("Player \"○\" wins!");
    }
  }
}
