package ru.edu.mti.labwork3;

/**
 * Тест класса Кредит
 * @author Белых Евгений
 *
 */
public class TestCredit {

	public static void main(String[] args) {
		
		System.out.println("Смоделируем ситуацию выдачи кредита на сумму 10000,\n"
				+ "процентная ставка 17% годовых, сроком 36 месяцев");
		//создаем объект кредита
		Credit credit = new Credit();
		System.out.println("Заемщик " + credit.getClient() + " взял кредит");
		
		System.out.println("Рассчитываем аннуитетный платеж");
		//создаем объект аннуитетного платежа
		AnnuityPayment payment = new AnnuityPayment();
		credit.repayment(payment);
		
		System.out.println("Рассчитываем дифференцированный платеж за 1 месяц");
		DifferentiatedPayment payment2 = new DifferentiatedPayment(1);
		credit.repayment(payment2);
	}

}
