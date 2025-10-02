package lista07;

public class Account {
	private Integer number;
	private String holder;
	private Double Balance, withdrawLimit;
	
	public Account() {
		super();
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		Balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return Balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.Balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdrwan(amount);
		this.Balance -= amount;
	}
	
	public void validateWithdrwan(double amount) {
		if(amount>getWithdrawLimit()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		}
		if(amount>getBalance()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente");
		}
	}
}
