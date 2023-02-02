import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CamelCaseTest {
	
	ArrayList<String> palavras, palavrasNumberMid;
	
	@BeforeEach
	void inicializeCamelCase() {
		palavras = new ArrayList<String>();
		palavras.add("nome");
		palavras.add("composto");
		palavrasNumberMid = new ArrayList<String>();
		palavrasNumberMid.add("recupera");
		palavrasNumberMid.add("10");
		palavrasNumberMid.add("primeiros");
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
		assertEquals(palavrasNumberMid.toString(), cc.converterCamelCase("recupera10Primeiros").toString());
	}
	
	@Test
	void shoudConvertCamelCase(){
		assertArrayEquals(palavras.toArray(), CamelCase.converterCamelCase("nomeComposto").toArray());
	}
	
	@Test
	void shoudlowercaseSwords(){
		assertEquals("nome", CamelCase.palavraMinuscula("Nome"));
	}
	
	@Test
	void shoudSplitText(){
		assertArrayEquals(palavras.toArray(), CamelCase.quebraTexto("nomeComposto").toArray());
	}
	
	@Test
	void numberMid() {
		assertArrayEquals(palavrasNumberMid.toArray(), CamelCase.converterCamelCase("recupera10Primeiros").toArray());
	}

	
}
