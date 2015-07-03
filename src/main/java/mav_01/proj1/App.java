package mav_01.proj1;

import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Thread t = Thread.currentThread();
    	System.out.println(t);
    	t.setName("jehehehehe");
    	System.out.println(t);
    	try 
    	{
    		for(int i = 5; i > 0; i--)
    		{
    			System.out.println(i);
	    		Thread.sleep(800);
	    	}
    	}
    	catch(InterruptedException e)
    	{
    		System.out.println("done, dude");
    	}
    }
}
