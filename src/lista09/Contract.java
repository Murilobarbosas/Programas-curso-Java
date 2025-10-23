package lista09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate date;
	private Double contrato;
	
	private List<Installment> list = new ArrayList<>();
	
	public Contract() {
		super();
	}

	public Contract(Integer number, LocalDate date, Double contrato) {
		this.number = number;
		this.date = date;
		this.contrato = contrato;
	}

	public Contract(Integer number, LocalDate date, Double contrato, List<Installment> list) {
		super();
		this.number = number;
		this.date = date;
		this.contrato = contrato;
		this.list = list;
	}

	public List<Installment> getList() {
		return list;
	}

	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Double getContrato() {
		return contrato;
	}


	public void setContrato(Double contrato) {
		this.contrato = contrato;
	}
	
	
}
