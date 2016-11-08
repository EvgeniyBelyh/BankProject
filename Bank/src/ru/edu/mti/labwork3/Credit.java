package ru.edu.mti.labwork3;

/**
 * Кредит
 * @author Белых Евгений
 */
public class Credit {
	
	private double rate = 0.17; //годовая ставка по кредиту, коэффициент
	private int period = 36; //количество периодов оплаты, месяцы
	private double amount; //сумма кредита
	private Client client; //заемщик
	
	//конструкторы
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

	//геттеры и сеттеры
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
	 * метод погашения платежа
	 * @param payment - способ расчета
	 */
	public void repayment(MonthlyPayment payment) {
		System.out.println("Сумма платежа: " + payment.calculation(this.amount, this.period, this.rate));
		
	}
	
}
