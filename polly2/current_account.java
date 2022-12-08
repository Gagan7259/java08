package polly2;

public class current_account extends Account {
	private double min_bal;

	public double getMin_bal() {
		return min_bal;
	}

	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * }
	 */
	public void cal_bal() {
		double bal=getBalancs();
		double bal1=getMin_bal();
		bal=bal-bal1;
		System.out.println(bal);
	}

}
