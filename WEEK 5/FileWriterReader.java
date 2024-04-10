import java.io.*;
public class FileWriterReader
{
         public static void main(String args[])
         {
File f1=new File("D:\\sreekanth\\Java Training\\Core java Training FINAL\\WEEK -5\\demofile1.txt");

try {
     if(!f1.exists()) {
       f1.createNewFile();
       System.out.println("File created: " + f1.getName());
       } else 
        System.out.println("File already exists.");

       FileWriter myWriter = new FileWriter(f1);
       FileReader myReader=new FileReader(f1);   
// Writes characters
       System.out.println("Writing to the file created using FileWriter");
       myWriter.write("Files in Java might be tricky, but it is fun enough!");
       myWriter.close();
// Reads characters
	System.out.println("Reading from the file created using FileReader");
     int i;
     while((i=myReader.read())!=-1)    
          System.out.print((char)i);    
       myReader.close();
      
      
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

	

}






}