package mavenHelloWorldProject;

import static org.junit.Assert.fail;
import org.junit.Test;

public class Tests {

	@Test
	public void HelloWorld()
	{
		System.out.println("Hello World");
		//fail();
		
	}
	
	@Test
	public void HelloWorldTwo()
	{
		System.out.println("Hello World 2");
		fail();
		
	}

}
