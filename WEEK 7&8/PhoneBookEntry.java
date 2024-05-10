public class PhoneBookEntry {
   public String name, address, phone;
 
   public PhoneBookEntry(String name) {  // constructor, ignore address and phone
      this.name = name;
   }
 
   @Override
   public String toString() {
      return name;
   }
}