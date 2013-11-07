package conta;

public class Cliente {
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;

	public void mudarCPF(String cpf) {
		if (this.idade <= 60) {
			validaCPF(cpf);
		}

		this.cpf = cpf;
	}

	public void validaCPF(String cpf) {
		// séries de regras aqui, falha caso não seja válido
	}

	// ..
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
