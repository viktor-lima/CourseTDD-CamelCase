import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CamelCaseTest {
	
	ArrayList<String> palavras;
	
	@BeforeEach
	void inicializeCamelCase() {
		palavras = new ArrayList<String>();
		palavras.add("nome");
		palavras.add("composto");
	}

	@Test
	void listCamelCaseIsEmpty() {
		CamelCase cc = new CamelCase();
		assertTrue(cc.isEmpty());
		assertEquals(0, cc.size());
	}
	
	@Test
	void shouldInsertOneSimpleString() {
		CamelCase cc = new CamelCase();
		cc.insert("nome");
		assertEquals(1, cc.size());
		assertEquals("nome", cc.header());
	}
	
	@Test
	void shouldInsertOneCompoundString() {
		CamelCase cc = new CamelCase();
		
		assertEquals(palavras.toString(), cc.converterCamelCase("NomeComposto").toString());
	}
	
	@Test
	public void shoudConvertCamelCase(){
		assertArrayEquals(palavras.toArray(), CamelCase.converterCamelCase("nomeComposto").toArray());
	}
	
	@Test
	public void shoudlowercaseSwords(){
		assertEquals("nome", CamelCase.palavraMinuscula("Nome"));
	}
	
	@Test
	public void shoudSplitText(){
		assertArrayEquals(palavras.toArray(), CamelCase.quebraTexto("nomeComposto").toArray());
	}
	
	

	
}
