import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CamelCaseTest {

	@Test
	void listCamelCaseIsEmpty() {
		CamelCase cc = new CamelCase();
		assertTrue(cc.isEmpty());
		assertEquals(0, cc.size());
	}
	
	@Test
	void shouldInsertOneSimpleString() {
		CamelCase cc = new CamelCase();
		cc.insert("Nome");
		assertEquals(1, cc.size());
		assertEquals("Nome", cc.header());
	}

	@Test
	void shouldInsertOneCompoundString() {
		CamelCase cc = new CamelCase();
		cc.split("NomeComposto");		
	}
	
}
