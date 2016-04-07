import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestCalc {
	@Test
	   public void test_get() {
		Calculation c=new Calculation();
		c.setPrincipal(200000);
		c.setRate(0.0525);
		c.setTerm(30);
		c.Calculate();
		System.out.println(c.getPayment()) ;
		assertEquals(1104.41, c.getPayment(), 0.005);
	   }
}
