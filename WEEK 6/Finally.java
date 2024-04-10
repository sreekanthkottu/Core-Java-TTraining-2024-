public class excep6
{
       public static void main(String args[])
       {
	System.out.println("process is started..");
	try{
	     int a=Integer.parseInt(args[0]);
	      System.out.println("a value :"+a);	
	}catch(NumberFormatException e)
	{
		System.out.println(e);
		//return;
		System.exit(0);
	}
	finally
	{
		System.out.println("execution of finally block...");
	}
	System.out.println("process is over..");
       }
}