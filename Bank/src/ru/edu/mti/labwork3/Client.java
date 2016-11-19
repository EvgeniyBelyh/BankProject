package ru.edu.mti.labwork3;

/**
 * Клиент
 * @author Белых Евгений
 *
 */
public class Client {
	
	private String lastName; //фамилия клиента
	private String firstName; //имя клиента
	private String middleName; //отчество клиента
	
	public Client() {
		this("Белых","Евгений","Владимирович");
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
	
	/**
	 * Возвращает полное имя клиента
	 * @param lastName - Фамилия
	 * @param firstName - Имя
	 * @param middleName - Отчество
	 * @return ФИО
	 */
	public static String getFullName(String lastName, String firstName, String middleName) {
		return lastName + " " + firstName + " " + middleName;
	}
	
	
	//переопределяем метод вывода в консоль
	@Override
	public String toString() {
		return Client.getFullName(this.lastName, this.firstName, this.middleName);
	}
	
	
	

}
