package br.com.override;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaBancariaTest {

	@Test
	void testObjetoContaBancaria() {
		ContaBancaria obj1 = new ContaBancaria("Beatriz", 1234, 1500);
		assertEquals("Beatriz",obj1.getCliente());
		assertEquals(1234,obj1.getNumConta());
		assertEquals(1500,obj1.getSaldo());
	}

}
