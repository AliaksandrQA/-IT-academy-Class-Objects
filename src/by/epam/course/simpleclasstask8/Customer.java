package by.epam.course.simpleclasstask8;

/* Создать класс Customer, спецификация которого приведена ниже.
 *  Определить конструкторы, set- и get- методы и
метод toString().
 Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль. 
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/

/* здесь формируется поля, характеризующие создаваемого Customer'a */

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronimic;
	private String address;
	private int creditCardNum;
	private int bankAccount;

	public Customer() {

	}
	
	public Customer(int id) {
		this.id = id;
	}
	
	public Customer(String surname, String name, String patronimic, String address) {

		this.surname = surname;
		this.name = name;
		this.patronimic = patronimic;
		this.address = address;
	}
	

	public Customer(int id, String surname, String name, String patronimic, String address, int creditCardNum, int bankAccount) {

		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronimic = patronimic;
		this.address = address;
		this.creditCardNum = creditCardNum;
		this.bankAccount = bankAccount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronimic() {
		return patronimic;
	}

	public void setPatronimic(String patronimic) {
		this.patronimic = patronimic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(int creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronimic=" + patronimic
				+ ", address=" + address + ", creditCardNum=" + creditCardNum + ", bankAccount=" + bankAccount + "]";
	}

}
