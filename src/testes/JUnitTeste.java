package testes;

import junit.framework.TestCase;

public class JUnitTeste extends TestCase {
	Operacao op = new Operacao();
	public void testAdicao1() {
		assertEquals(4.0, op.adicao(2, 2));
	}
	
	public void testAdicao2() {
		assertEquals(3.0, op.adicao(1, 1));
	}
	
	public void testAdicao3() {
		assertEquals(6.0, op.adicao(2, 4));
	}
	
	public void testSubtracao1() {
		assertEquals(1.0, op.subtracao(2, 1));
	}
	
	public void testSubtracao2() {
		assertEquals(1.0, op.subtracao(3, 2));
	}
	
	public void testSubtracao3() {
		assertEquals(-2.0, op.subtracao(2, 4));
	}
	
	public void testMultiplicacao1() {
		assertEquals(2.0, op.multiplicacao(2, 1));
	}
	
	public void testMultiplicacao2() {
		assertEquals(6.0, op.multiplicacao(3, 2));
	}
	
	public void testMultiplicacao3() {
		assertEquals(8.0, op.multiplicacao(2, 4));
	}
	
	public void testDivisao1() {
		assertEquals(2.0, op.divisao(4, 2));
	}
	
	public void testDivisao2() {
		assertEquals(3.0, op.divisao(6, 2));
	}
	
	public void testDivisao3() {
		assertEquals(5.0, op.divisao(12, 6));
	}
}
