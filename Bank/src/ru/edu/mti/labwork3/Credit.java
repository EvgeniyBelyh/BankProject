package ru.edu.mti.labwork3;

/**
 * ������
 * @author ����� �������
 */
public class Credit {
	
	private double rate = 0.17; //������� ������ �� �������, �����������
	private int period = 36; //���������� �������� ������, ������
	private double amount; //����� �������
	private Client client; //�������
	
	//������������
	public Credit() {
		this.amount = 10000;
		this.client = new Client();
	}	
	
	public Credit(double rate, int period, double amount, Client client) {
		this.rate = rate;
		this.period = period;
		this.amount = amount;
		this.client = client;
	}

	//������� � �������
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	/**
	 * ������������ ������������������ ������
	 * @param creditAmount - ����� �������
	 * @param period - ���� ������� � �������
	 * @param rate - ������
	 * @param periodNumber - ����� ������
	 * @return ������������������ �������� ������
	 */
	public static double calcDiffPayment(double creditAmount, int period, double rate, int periodNumber) {
		rate = rate/12;
		return creditAmount/period + creditAmount * (period - periodNumber + 1) * rate/period;
	}
	
	
	/**
	 * ������������ ����������� ������
	 * @param creditAmount - ����� �������
	 * @param period - ���� ������� � �������
	 * @param rate - ������
	 * @return ����������� ������
	 */
	public static double calcAnnuityPyment(double creditAmount, int period, double rate) {
		rate = rate/12;
		return creditAmount*rate/(1 - 1/Math.pow((1+rate),period));
	}
	
	
	/**
	 * ����� ��������� �������
	 * @param payment - ������ �������
	 */
	public void repayment(MonthlyPayment payment) {
		System.out.println("����� �������: " + payment.calculation(this.amount, this.period, this.rate));
		
	}
	
}
