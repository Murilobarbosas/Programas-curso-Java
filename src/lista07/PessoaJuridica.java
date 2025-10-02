package lista07;

public class PessoaJuridica extends Pessoa{
	private int numeroFuncionarios;
	
	public PessoaJuridica(String nome, Double renda) {
		super(nome, renda);
	}

	public PessoaJuridica(String nome, Double renda, int numeroFuncionarios) {
		super(nome, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calculo() {
		if(numeroFuncionarios<=10) {
			return getRenda()*0.16;
		}else {
			return getRenda()*0.14;
		}
	}

	@Override
	public String toString() {
		return getNome() + ": $ " + String.format("%.2f", calculo());
	}
}
