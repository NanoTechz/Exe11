package conta.test;

import static org.junit.Assert.*;

import org.junit.Test;

import conta.Conta;

public class TestDeposita {

	@Test
	public void testDepositoValorNegativo() {
		Conta conta = new Conta(null, 171);
		
		conta.deposita(-100);
		
	}

}
