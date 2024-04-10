import java.io.*;  
public class FileInputOutputStream{  
    public static void main(String[] args) throws IOException{  
	File f1=new File("D:\\sreekanth\\Java Training\\Core java Training FINAL\\WEEK -5\\demofile2.txt");
try{
	if (!f1.exists()) {
		f1.createNewFile();
        	System.out.println("File created: " + f1.getName());
	}        
// Writes characters
	System.out.println("Writing to the file created using FileOutputStream");
	FileOutputStream fout = new FileOutputStream(f1);  
        FileInputStream fin=new FileInputStream(f1); 
        String s="Files in Java might be tricky, but it is fun enough!";      
        byte b[]=s.getBytes();      
        fout.write(b);   
        fout.close();


// Reads characters
	System.out.println("Reading from the file created using FileInputStream");
	int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();  
     } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

   
    }  
}  


