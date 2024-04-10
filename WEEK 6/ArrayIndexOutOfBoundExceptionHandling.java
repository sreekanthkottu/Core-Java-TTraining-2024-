import java.lang.*;
import java.io.*;
public class ArrayIndexOutOfBoundExceptionHandling {  
  
    public static void main(String[] args) {  
    String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
	//Here, no element is present at the iteration number arr.length, i.e 4  
	//So it will throw ArrayIndexOutOfBoundException at iteration 4           
      try{
	for(int i=0;i<=arr.length;i++) {       
             System.out.println(arr[i]);      
        } 
	}catch( ArrayIndexOutOfBoundException ex){
		 System.out.println("ArrayIndexOutOfBoundException:"+ex);    
	}
  
    }  
  
}  