import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFormat {
	@Test
	   public void test_get() {
		Format f=new Format();
		
		
	     // Subscription S = new Subscription(200,2) ;
		double d=1.234567;
		
		assertEquals(f.FormatPayment(d),"$1.23");
	   }
}
