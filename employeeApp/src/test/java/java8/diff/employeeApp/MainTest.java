package java8.diff.employeeApp;

import static org.junit.Assert.*;

import org.junit.Test;
import static java8.diff.employeeApp.TestUtils.*
;public class MainTest {

	@Test
    public void testBusinessConditon() throws Exception{
	 yakshaAssert(currentTest(),true,businessTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }

	


}
