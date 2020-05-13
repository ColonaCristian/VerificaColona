import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CognomeTest {

	@Test
	void test1() {
		ColonaClass c=new ColonaClass();
		assertEquals(2187,c.cognomeMet(3,7));
	}

	@Test
	void test2() {
		ColonaClass c=new ColonaClass();
		assertEquals(0,c.cognomeMet(0,1));
	}

	@Test
	void test3() {
		ColonaClass c=new ColonaClass();
		assertEquals(1,c.cognomeMet(0,0));
	}

}
