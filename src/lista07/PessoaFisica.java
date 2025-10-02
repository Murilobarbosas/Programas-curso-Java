package lista07;

public class PessoaFisica extends Pessoa{
	private Double saude;

	public PessoaFisica(String nome, Double renda) {
		super(nome, renda);
	}

	public PessoaFisica(String nome, Double renda, Double saude) {
		super(nome, renda);
		this.saude = saude;
	}

	public double getSaude() {
		return saude;
	}

	public void setSaude(double saude) {
		this.saude = saude;
	}

	@Override
	public double calculo() {
		if(this.getRenda()<20000) {
			if(saude>0) {
				return getRenda()*0.15 - saude*0.50;
			}else {
				return getRenda()*0.15;
			}
		}else{
			if(saude>0) {
				return getRenda()*0.25 - saude*0.50;
			}else {
				return getRenda()*0.25;
			}
		}
	}

	@Override
	public String toString() {
		return getNome() + ": $ " + String.format("%.2f", calculo());
	}
}
