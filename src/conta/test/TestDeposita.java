package conta.test;

import static org.junit.Assert.*;

import org.junit.Test;

import conta.Conta;
import conta.ValorInvalidoException;

public class TestDeposita {

	@Test
	public void testDepositoValorNegativo() {
		Conta conta = new Conta(null, 171);
		
		conta.deposita(-100);
		
	}
	
	@Test 
	public void testPrint(){
		try{
			Conta conta = new Conta(null, 171);
			conta.deposita(-100);
		} catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		}

	}

}
