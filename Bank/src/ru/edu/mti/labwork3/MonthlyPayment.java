package ru.edu.mti.labwork3;

/**
 * ≈жемес€чный платеж
 * @author Ѕелых ≈вгений
 *
 */
public abstract class MonthlyPayment {
	/**
	 * –ассчитывает ежемес€чный платеж
	 * @param creditAmount - сумма кредита
	 * @param period - количество периодов оплаты
	 * @param rate - ставка по кредиту
	 * @return - сумма ежемес€чного платежа
	 */
	public abstract double calculation(double creditAmount, int period, double rate);
}
