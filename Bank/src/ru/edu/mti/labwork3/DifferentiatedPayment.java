package ru.edu.mti.labwork3;

/**
 * Дифференцированный платеж
 * @author Белых Евгений
 *
 */
public class DifferentiatedPayment extends MonthlyPayment {
	
	private int periodNumber; //порядковый номер платежа
	
	//конструктор	
	public DifferentiatedPayment(int periodNumber) {
		this.periodNumber = periodNumber;
	}

	//геттеры и сеттеры
	public int getPeriodNumber() {
		return periodNumber;
	}

	public void setPeriodNumber(int periodNumber) {
		this.periodNumber = periodNumber;
	}

	//расчет суммы дифференцированного платежа
	@Override
	public double calculation(double creditAmount, int period, double rate) {
		rate = rate/12;
		return creditAmount/period + creditAmount * (period - this.periodNumber + 1) * rate/period;
	}

}
