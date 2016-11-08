package ru.edu.mti.labwork3;

/**
 * ������
 * @author ����� �������
 *
 */
public class Client {
	
	private String lastName; //������� �������
	private String firstName; //��� �������
	private String middleName; //�������� �������
	
	public Client() {
		this("�����","�������","������������");
	}

	public Client(String lastName, String firstName, String middleName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	//�������������� ����� ������ � �������
	@Override
	public String toString() {
		return this.lastName + " " + this.firstName + " " + this.middleName;
	}
	
	
	

}
