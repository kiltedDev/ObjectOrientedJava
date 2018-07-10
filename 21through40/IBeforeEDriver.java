import java.io.FileInputStream;
import java.util.ArrayList;

public class IBeforeEDriver {
  public static void main( String[] args) throws Exception {
    FileInputStream file = new FileInputStream("../datafiles/en-sample.txt");
    IBeforeEChecker check = new IBeforeEChecker(file);
    ArrayList<String> wordList = check.getWordList();
    int count = 0;

    System.out.println(check.getWordCount() + " ie/ei words found.");
    System.out.print("\t" + check.getMatches() + " match the rule, ");
    System.out.print( check.getExceptions() + " do not: ");
    System.out.println(100.0*check.getMatches()/check.getWordCount() + "%");



    System.out.println("Words: ");
    for (String word : wordList) {
      count++;
      if (count%3 == 0) {
        System.out.print("\t\t" + word + "\n");
      } else {
        System.out.print("\t\t" + word);
      }
    }
    System.out.println();
  }
}
