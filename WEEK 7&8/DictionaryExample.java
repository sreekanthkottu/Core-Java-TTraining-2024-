mport java.util.*;  
public class DictionaryExample  
{  
public static void main(String args[])  
{  
//creating a dictionary  
Dictionary dict = new Hashtable();  
//adding values in the dictionary  
dict.put(101, "Sydney");  
dict.put(102, "Brisbane");  
dict.put(103, "Melbourne");  
dict.put(104, "Perth");  
dict.put(105, "Lismore");  
dict.put(106, "Mount Gambier");  
dict.put(107, "Nelson Bay");  
dict.put(108, "Canberra");  
//prints keys and corresponding values  
System.out.println(dict);  
}  
}  
