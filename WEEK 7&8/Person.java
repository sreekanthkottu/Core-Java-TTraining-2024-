public class Person {
   private String name;  // private instance variables
   private int age;

   public Person(String name, int age) {  // constructor
      this.name = name; this.age = age;
   }
   public String getName() {  // getter for name
      return name;
   }
   public int getAge() {  // getter for age
      return age;
   }
   public String toString() {  // describe itself
      return name + "(" + age + ")";
   }

   public void sayHello() {  // for testing
      System.out.println(name + " says hello");
   }

   // Compare two Person objects by name strings, case insensitive
   @Override
   public boolean equals(Object o) {
      return o != null && o instanceof Person && this.name.equalsIgnoreCase(((Person)o).name);
   }
   // To be consistent with equals()
   // Two objects which are equal shall have the same hashcode.
   @Override
   public int hashCode() {
      return this.name.toLowerCase().hashCode();
   }
}