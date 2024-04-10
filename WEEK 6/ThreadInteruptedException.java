public class excep5
{     public static void demo() throws InterruptedException
       {
	for(int i=1;i<=5;i++)	
	{
		System.out.println("welcome to sminfo..");
		Thread.sleep(4000);
	}
	
       }
       public static void main(String args[])
       {	
	System.out.println("process is started..");
	try{
	demo();
	}catch(InterruptedException e)
	{
		System.out.println(e);
	}
	System.out.println("process is over..");	
       }
}

/*
	
  Thread class
	\
public static void sleep(int ms) throws InterrutedException
*/