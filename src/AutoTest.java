import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoTest {

	Auto a;
	float risultatoAtteso;
	float risultatoOttenuto;

	@Before
	public void setUp() throws Exception {
		a=new Auto("","");
	}

	@After
	public void tearDown() throws Exception {
		assertEquals(risultatoAtteso,risultatoOttenuto,0.1);
	}

	@Test
	public void testCalcolaBollo1() {
		risultatoAtteso=100;
		risultatoOttenuto=a.calcolaBollo(40);
	}
	
	@Test
	public void testCalcolaBollo2() {
		risultatoAtteso=300;
		risultatoOttenuto=a.calcolaBollo(120);
	}
	
	@Test
	public void testCalcolaBollo3() {
		risultatoAtteso=400;
		risultatoOttenuto=a.calcolaBollo(160);
	}

}
