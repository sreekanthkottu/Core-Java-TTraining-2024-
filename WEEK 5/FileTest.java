import java.io.*;
public class FileTest
{
         public static void main(String args[])
         {

try{
           File f1=new File("D:\\sreekanth\\Java Training\\Core java Training FINAL\\WEEK -5\\Folder1");
	   if(!f1.exists()){
	       f1.mkdir();
	       System.out.println("folder is created.");
	   }
	   if(f1.exists()){
	       System.out.println("folder exists..");
	       System.out.println("Folder name:-"+f1.getName());
	       System.out.println("Folder path:-"+f1.getPath());
	       System.out.println("Folder parent:-"+f1.getParent());
	       System.out.println("Is it a file? "+f1.isFile());
	       System.out.println("Is it readable? "+f1.canRead());
	       System.out.println("Is it writable? "+f1.canWrite());
	       System.out.println("Last modified in milliseconds:= "+f1.lastModified());
	    }else
		System.out.println("folder not found..");
         

	File f2=new File("D:\\sreekanth\\Java Training\\Core java Training FINAL\\WEEK -5\\Folder1\\demofile1.txt");
	File f3=new File("D:\\sreekanth\\Java Training\\Core java Training FINAL\\WEEK -5\\Folder1\\demofile2.txt");
	if (!f2.exists()){
	    f2.createNewFile();
            System.out.println("File created:-"+f2.getName());
	}
	if (!f3.exists()){
	    f3.createNewFile();
            System.out.println("File created:-"+f3.getName());
	}

 
	System.out.println("List of items in the Directory");
            if(f1.exists()  &&  f1.isDirectory()){
	        String items[]=f1.list();
	            for(int i=0;i<items.length;i++)
		System.out.println(items[i]);
	    }

} catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}

}