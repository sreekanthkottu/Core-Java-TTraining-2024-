import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// JDK 8 Collection, Stream and Functional Programming
public class J8StreamOfPersonTest {
   public static void main(String[] args) {
      List<Person> personLst = List.of(  // JDK 9 instantiation of an unmodifiable List
         new Person("Peter", 21),
         new Person("Paul", 18),
         new Person("John", 60)
      );
      System.out.println(personLst);  //[Peter(21), Paul(18), John(60)]

      // Use a Predicate to filter the elements
      Predicate<Person> adult = p -> p.getAge() >= 21;

      // All adults say hello (filter-reduce(foreach))
      personLst
         .stream()
         .filter(adult)
         .forEach(Person::sayHello);
      //Peter says hello
      //John says hello

      // Use a parallel stream (reduce(foreach))
      personLst
         .parallelStream()
         .forEach(p -> System.out.println(p.getName()));
      //Paul
      //Peter
      //John

      // Get the average age of all adults (filter-map-reduce(aggregate))
      double aveAgeAdults = personLst
         .stream()
         .filter(adult)
         .mapToInt(Person::getAge)
         .average()
         .getAsDouble();
      System.out.println(aveAgeAdults);
      //40.5

      // Collect the sum of ages (reduce(aggregate))
      int sumAges = personLst
         .stream()
         .collect(Collectors.summingInt(Person::getAge));
      System.out.println(sumAges);
      //99

      // Collect the names starting with 'P' (filter-map-reduce(collect))
      List<String> nameStartWithP = personLst
         .stream()
         .filter(p -> p.getName().charAt(0) == 'P')
         .map(Person::getName)
         .collect(Collectors.toList());
      System.out.println(nameStartWithP);
      //[Peter, Paul]
   }
}