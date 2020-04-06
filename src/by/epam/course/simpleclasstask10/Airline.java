package by.epam.course.simpleclasstask10;

import java.util.LinkedList;

/*// Создать класс Airline, спецификация которого приведена ниже. - > checked
 *  Определить конструкторы, set- и get- методы и // метод toString(). - > checked
 *  Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
// методами. 
 *  Задать критерии выбора данных и вывести эти данные на консоль.
// Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. - > checked
 * 
// Найти и вывести:
// a) список рейсов для заданного пункта назначения;
// b) список рейсов для заданного дня недели;
// c) список рейсов для заданного дня недели, время вылета для которых больше заданного. */

public class Airline {
	
	private String destination;
	private String flight;
	private String plane;
	private String departure;
	private LinkedList<String> day; 
	
	public Airline () {
		
	}

	public Airline(String destination, String flight, String plane, String departure, LinkedList<String> day) {
		super();
		this.destination = destination;
		this.flight = flight;
		this.plane = plane;
		this.departure = departure;
		this.day = day;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public LinkedList<String> getDay() {
		return day;
	}

	public void setDay(LinkedList<String> day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flight=" + flight + ", plane=" + plane + ", departure="
				+ departure + ", day=" + day + "]";
	}

	
}
