package shopAppl28_12;

import java.util.Date;

public class Bill {
	private Date date;
	private double total;
	private double cgst;
	private double sgst;
	private double finalTotal;
	public Bill(double total, Date date,  double cgst, double sgst, double finalTotal) {
		super();
		this.total = total;
		this.date = date;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finalTotal = finalTotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getFinalTotal() {
		return finalTotal;
	}
	public void setFinalTotal(double finalTotal) {
		this.finalTotal = finalTotal;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
