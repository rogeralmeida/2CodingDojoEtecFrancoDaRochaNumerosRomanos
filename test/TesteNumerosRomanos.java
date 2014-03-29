import static org.junit.Assert.*;

import org.junit.Test;


public class TesteNumerosRomanos {

	@Test
	public void testeTraducaoI() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("I");
		assertEquals(new Integer(1), traducao);
	}
	
	@Test
	public void testeTraducaoV() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("V");
		assertEquals(new Integer(5), traducao);
	}
	
	@Test
	public void testeTraducaoX() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("X");
		assertEquals(new Integer(10), traducao);
	}
	
	@Test
	public void testeTraducaoL() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("L");
		assertEquals(new Integer(50), traducao);
	}
	@Test
	public void testeTraducaoC() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("C");
		assertEquals(new Integer(100), traducao);
	}
	
	@Test
	public void testeTraducaoD() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("D");
		assertEquals(new Integer(500), traducao);
	}
	
	@Test
	public void testeTraducaoM() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("M");
		assertEquals(new Integer(1000), traducao);
		
		
	}
	
	@Test
	public void testeTraducaoII() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("II");
		assertEquals(new Integer(2), traducao);
	}
	
	@Test
	public void testeTraducaoIII() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("III");
		assertEquals(new Integer(3), traducao);
	}
	
	@Test
	public void testeTraducaoIV() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("IV");
		assertEquals(new Integer(4), traducao);
	}


	@Test
	public void testeTraducaoVI() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("VI");
		assertEquals(new Integer(6), traducao);
	}
	@Test
	public void testeTraducaoVII() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("VII");
		assertEquals(new Integer(7), traducao);
	}
	@Test
	public void testeTraducaoVIII() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("VIII");
		assertEquals(new Integer(8), traducao);
	}
	@Test
	public void testeTraducaoIX() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("IX");
		assertEquals(new Integer(9), traducao);
	}
	@Test
	public void testeTraducaoXI() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("XI");
		assertEquals(new Integer(11), traducao);
	}
	
	@Test
	public void testeTraducaoXII() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("XII");
		assertEquals(new Integer(12), traducao);
	}
	
	@Test
	public void testeTraducaoXIII() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("XIII");
		assertEquals(new Integer(13), traducao);
	}
	
	@Test
	public void testeTraducaoXIV() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("XIV");
		assertEquals(new Integer(14), traducao);
	}
	
	@Test
	public void testeTraducaoXV() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("XV");
		assertEquals(new Integer(15), traducao);
	}
	
	@Test
	public void testeTraducaoXVI() {
		NumerosRomanos classeEmTeste = new NumerosRomanos();
		Integer traducao = classeEmTeste.traduz("XVI");
		assertEquals(new Integer(16), traducao);
	}
}
