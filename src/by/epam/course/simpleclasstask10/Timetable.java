package by.epam.course.simpleclasstask10;

import java.util.ArrayList;

public class Timetable {
	
	ArrayList <Airline> schedule = new ArrayList <Airline>(); // создаём динамический массив 
	
	public Timetable() {} // конструктор без параметров  

	public Timetable(ArrayList<Airline> schedule) { // конструктор с параметрами - > принимает ссылку дин-го массива 
		super();
		this.schedule = schedule;
	}

	public ArrayList<Airline> getSchedule() { // геттер 
		return schedule;
	}

	public void setSchedule(ArrayList<Airline> schedule) { // сеттер 
		this.schedule = schedule;
	}

}
