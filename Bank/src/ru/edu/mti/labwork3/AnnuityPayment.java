package ru.edu.mti.labwork3;

/**
 * Аннуитетный платеж
 * @author Белых Евгений
 */
public class AnnuityPayment extends MonthlyPayment {
	
	@Override
	public double calculation(double creditAmount, int period, double rate) {
		
		rate = rate/12;
		return creditAmount*rate/(1 - 1/Math.pow((1+rate),period));
	}

}
