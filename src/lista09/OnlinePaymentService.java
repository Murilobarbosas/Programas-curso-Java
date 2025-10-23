package lista09;

public interface OnlinePaymentService {
	double paymentfee(double amount);
	double interest(double amount, int months);
}
