package lista09;

import java.time.LocalDate;


public class ContractService {
	private OnlinePaymentService online;

	public ContractService(OnlinePaymentService online) {
		this.online = online;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getContrato() / months;
		for(int i=1; i<=months;i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double intererst = online.interest(basicQuota, i);
			double fee = online.paymentfee(basicQuota + intererst);
			double quota = basicQuota + intererst + fee;
			
			contract.getList().add(new Installment(dueDate, quota));
		}
	}
}
