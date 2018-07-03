import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCounter {
  private ArrayList<String> words;

  public WordCounter( String url) {
    words = new ArrayList<String>();

    Scanner webInput = null;
    try {
      URL u = new URL(url);
      webInput = new Scanner(u.openStream());
    }
    catch (Exception e) {
      System.err.println("Couldn't open the url '" + url + "'.  Sorry.");
      System.exit(1);
    }

    while (webInput.hasNext() )
      words.add( webInput.next() );
    webInput.close();
  }

  public int getCount( String word ) {
    int count = 0;
    word = word.toLowerCase();
    for (String s : words) {
      if (s.toLowerCase().equals(word) ) {
        count++;
      }
    }
    return count;
  }
}
