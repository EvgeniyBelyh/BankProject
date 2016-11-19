package ru.edu.mti.labwork3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UnitTest {
	
	AnnuityPayment annuityPayment;
	DifferentiatedPayment differentiatesPayment;
	Credit credit;
	
	//���� �������� ��� �������
	@Test
	public void testFullName() {
		Assert.assertEquals("����� ������� ������������", Client.getFullName("�����", "�������", "������������"));
	}
	
	//���� ������������ �������
	@Test
	public void testAnnuityPayment() {
		Assert.assertEquals(356.5272752674469, Credit.calcAnnuityPyment(10000, 36, 0.17));
	}
	
	//���� ������������������� �������
	@Test
	public void testDiffPayment() {
		Assert.assertEquals(419.44444444444446, Credit.calcDiffPayment(10000, 36, 0.17, 1));
	}
	
	//������� ����������� ������� �� ������ �����
	@Before
	public void init() {
		annuityPayment = new AnnuityPayment();
		differentiatesPayment = new DifferentiatedPayment(1);
		credit = new Credit();
	}
	
	//����������� ������
	@After
	public void clean() {
		annuityPayment = null;
		differentiatesPayment = null;
		credit = null;
	}
	
	@Test
	public void testRepayment() {
		//���� ������������ ������� ����� ������
		Assert.assertEquals(356.5272752674469, annuityPayment.calculation(credit.getAmount(), credit.getPeriod(), credit.getRate()));
		
		//���� ������������������� ������� ����� ������
		Assert.assertEquals(419.44444444444446, differentiatesPayment.calculation(credit.getAmount(), credit.getPeriod(), credit.getRate()));
	}
}
