package test.java.com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;
import main.java.com.mycompany.app.App;

public class AppTest 
    extends TestCase
{
	ArrayList<Integer> ar1=new ArrayList<Integer> ();
	ArrayList<Integer> ar2=new ArrayList<Integer> ();
	ArrayList<Integer> ar3=new ArrayList<Integer> (Arrays.asList(1,2,3,4,5,5,1,4,5)) ;
	ArrayList<Integer> ar4=new ArrayList<Integer> (Arrays.asList(8,7,9,3,1,9,11,7,3));
 	
	public void testFirstArrayEmptyAndFind() {
		assertTrue(new App().calculate(ar1,ar3,3,1));
	}
	

	public void testFirstArrayEmptyAndNotFind() {
		assertFalse(new App().calculate(ar2,ar4,8,2));
	}

	public void testTwoArrayAndFind() {
		assertTrue(new App().calculate(ar3,ar4,5,3));
	}

	public void testTwoArrayAndNotFind() {
		assertFalse(new App().calculate(ar1,ar3,1,8));
	}

	public void testTwoArrayEmptyAndNotFind() {
		assertFalse(new App().calculate(ar1,ar2,11,8));
	}
}