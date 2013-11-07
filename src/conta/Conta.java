package conta;

public class Conta {
	private int numero;
	private Cliente titular;
	private double saldo;

	public Conta(Cliente titular, int numero){
		this.titular = titular;
		this.numero = numero;
	}
	
	public void saca(double quantidade) {
		if (quantidade > this.saldo) {
			System.out.println("Não posso sacar fora do limite!");
		} else {
			this.saldo = this.saldo - quantidade;
		}
	}

	public void deposita(double quantidade) {
		if (quantidade < 0){
			throw new IllegalArgumentException();
		}else{
			this.saldo = this.saldo + quantidade;
		}	
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

}
