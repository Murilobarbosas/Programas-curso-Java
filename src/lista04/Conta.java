package lista04;

public class Conta {
	private int num_conta;
	private String nome;
	private double valor;
	
	
	public Conta(int num_conta, String nome) {
		this.num_conta = num_conta;
		this.nome = nome;
	}

	public Conta(int num_conta, String nome, double valor) {
		this.num_conta = num_conta;
		this.nome = nome;
		deposito(valor);
	}

	public int getNum_conta() {
		return num_conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public double deposito(double valor) {
		this.valor = this.valor + valor;
		return this.valor;
	}
	
	public double saque(double valor) {
		return this.valor = this.valor - valor - 5;
	}

	@Override
	public String toString() {
		return "Acount " + num_conta + ", Holder: " + nome + ", Balance: " + valor;
	}
	
	
}
