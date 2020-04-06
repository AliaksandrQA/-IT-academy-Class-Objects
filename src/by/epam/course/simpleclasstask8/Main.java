package by.epam.course.simpleclasstask8;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.List;
import java.util.ArrayList;

/*создаем объекты Классов с помощью контрукторов, геттеров, сеттеров */

public class Main {

	public static void main(String[] args) {

		ClientBase base = new ClientBase();

		View myView = new View();

		Logic l = new Logic();

		base.addCustomer(new Customer(1, "Ivanov", "Ivan", "Ivanovich", " 1 Sovetskaya str", 1, 10012344));

		base.addCustomer(new Customer(23, "Petrov", "Grisha", "Petrovich", " 4 Lenina str", 2, 10077714));

		base.addCustomer(
				new Customer(17, "Sidorov", "Valentin", "Aleksandrovich", " 8 Pobedy str", 3, 10032088));

		base.addCustomer(new Customer(1003, "Gritsuk", "Maria", "Olehavna", "12 Pushkina str", 4, 10032234));

		base.addCustomer(
				new Customer(347, "Starikov", " Aleksei", "Romanovich", "37 Khimica str", 5, 10087965));
		

		 ArrayList<Customer> customers = base.getBase();
		 
		 
		
		 //List<Customer>  p = Logic.getListBySurname(customers);
		 
		 List<Customer> z = Logic.getListByAccountNumber(customers, 3, 5);
		 
		 myView.printBase(z);

	}

}
