
public class Calculation {
	private double rate;
	private double payment;
	private double principal;
	private int term;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate/12;
	}

	public double getPayment() {
		return payment;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term*12;
	}

	public Calculation() {
		
	}
	public void Calculate(){
		payment = (principal * rate) / (1 - Math.pow(1 + (rate), -term));
	}
}
