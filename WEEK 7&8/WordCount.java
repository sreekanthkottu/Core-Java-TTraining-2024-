// Counts the frequency of each of the words in a file given in the command-line,
// and saves in a map of {word, freq}.
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
 
public class WordCount {
   public static void main(String[] args) throws Exception {
      Scanner in = new Scanner(new File(args[0]));
 
      Map<String, Integer> map = new HashMap<>();
      while (in.hasNext()) {
         String word = in.next();
         int freq = (map.get(word) == null) ? 1 : map.get(word) + 1;   // type-safe
         map.put(word, freq);      // auto-box int to Integer and upcast, type-check
      }
      System.out.println(map);
   }
}