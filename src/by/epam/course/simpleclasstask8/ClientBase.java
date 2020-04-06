package by.epam.course.simpleclasstask8;

import java.util.ArrayList;

/* создание базы клиентов ->  base
 * создание конструктора базы клиентов 
 * создание сеттеров и геттеров
 * метод  наполнения базы клиентов
 * */
public class ClientBase  {

	private ArrayList<Customer> base = new ArrayList<Customer>(); 
	
	public ClientBase() {}; // конструктор без параметров 

	public ClientBase(ArrayList<Customer> base) { // конструктор с параметрами

		this.base = base;
	}

	public ArrayList<Customer> getBase() { // геттер для ArrayList
		return base;
	}

	public void setBase(ArrayList<Customer> base) { // сеттер для ArrayList
		this.base = base;
	}

	public void addCustomer( Customer client) { // метод для добавления клиентов в base
		base.add(client);
	}
}
