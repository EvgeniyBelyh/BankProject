package ru.edu.mti.labwork3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UnitTest {
	
	AnnuityPayment annuityPayment;
	DifferentiatedPayment differentiatesPayment;
	Credit credit;
	
	//Тест возврата ФИО клиента
	@Test
	public void testFullName() {
		Assert.assertEquals("Белых Евгений Владимирович", Client.getFullName("Белых", "Евгений", "Владимирович"));
	}
	
	//Тест аннуитетного платежа
	@Test
	public void testAnnuityPayment() {
		Assert.assertEquals(356.5272752674469, Credit.calcAnnuityPyment(10000, 36, 0.17));
	}
	
	//Тест дифференцированного платежа
	@Test
	public void testDiffPayment() {
		Assert.assertEquals(419.44444444444446, Credit.calcDiffPayment(10000, 36, 0.17, 1));
	}
	
	//создаем необходимые объекты до начала теста
	@Before
	public void init() {
		annuityPayment = new AnnuityPayment();
		differentiatesPayment = new DifferentiatedPayment(1);
		credit = new Credit();
	}
	
	//освобождаем память
	@After
	public void clean() {
		annuityPayment = null;
		differentiatesPayment = null;
		credit = null;
	}
	
	@Test
	public void testRepayment() {
		//Тест аннуитетного платежа через объект
		Assert.assertEquals(356.5272752674469, annuityPayment.calculation(credit.getAmount(), credit.getPeriod(), credit.getRate()));
		
		//Тест дифференцированного платежа через объект
		Assert.assertEquals(419.44444444444446, differentiatesPayment.calculation(credit.getAmount(), credit.getPeriod(), credit.getRate()));
	}
}
