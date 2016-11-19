package ru.edu.mti.labwork3;

/**
 *  редит
 * @author Ѕелых ≈вгений
 */
public class Credit {
	
	private double rate = 0.17; //годова€ ставка по кредиту, коэффициент
	private int period = 36; //количество периодов оплаты, мес€цы
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
	 * –ассчитывает дифференцированный платеж
	 * @param creditAmount - сумма кредита
	 * @param period - срок периода в мес€цах
	 * @param rate - ставка
	 * @param periodNumber - номер мес€ца
	 * @return дифференцированный мес€чный платеж
	 */
	public static double calcDiffPayment(double creditAmount, int period, double rate, int periodNumber) {
		rate = rate/12;
		return creditAmount/period + creditAmount * (period - periodNumber + 1) * rate/period;
	}
	
	
	/**
	 * –ассчитывает аннуитетный платеж
	 * @param creditAmount - сумма кредита
	 * @param period - срок периода в мес€цах
	 * @param rate - ставка
	 * @return аннуитетный платеж
	 */
	public static double calcAnnuityPyment(double creditAmount, int period, double rate) {
		rate = rate/12;
		return creditAmount*rate/(1 - 1/Math.pow((1+rate),period));
	}
	
	
	/**
	 * метод погашени€ платежа
	 * @param payment - способ расчета
	 */
	public void repayment(MonthlyPayment payment) {
		System.out.println("—умма платежа: " + payment.calculation(this.amount, this.period, this.rate));
		
	}
	
}
