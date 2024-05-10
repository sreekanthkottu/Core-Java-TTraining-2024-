import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
 
public class TreeSetComparatorTest {
   // Using a named inner class to implement Comparator<T>
   public static class PhoneBookComparator implements Comparator<PhoneBookEntry> {
      @Override
      public int compare(PhoneBookEntry p1, PhoneBookEntry p2) {
         return p2.name.compareToIgnoreCase(p1.name);  // descending name
      }
   }
 
   public static void main(String[] args) {
      PhoneBookEntry addr1 = new PhoneBookEntry("peter");
      PhoneBookEntry addr2 = new PhoneBookEntry("PAUL");
      PhoneBookEntry addr3 = new PhoneBookEntry("Patrick");
 
      Comparator<PhoneBookEntry> comp = new PhoneBookComparator();
      TreeSet<PhoneBookEntry> set = new TreeSet<PhoneBookEntry>(comp);
      set.add(addr1);
      set.add(addr2);
      set.add(addr3);
      System.out.println(set);    //[peter, PAUL, Patrick]
 
      Set<PhoneBookEntry> newSet = set.descendingSet();  // Reverse the order
      System.out.println(newSet); //[Patrick, PAUL, peter]
   }
}