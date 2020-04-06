package by.epam.course.simpleclasstask10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		Timetable timetable = new Timetable(); // создаем объект класса Timetable

		timetable.schedule.add(new Airline("Minks", "EE669", "Boing-747", "11:11",
				new LinkedList<String>(Arrays.asList("Monday", "Friday"))));
		timetable.schedule.add(new Airline("Moscow", "DD101", "SU-140", "12:50",
				new LinkedList<String>(Arrays.asList("Monday", "Sunday"))));
		timetable.schedule.add(new Airline("Minks", "QQ987", "Boing-747", "10:00",
				new LinkedList<String>(Arrays.asList("Tuesday", "Friday"))));
		timetable.schedule.add(new Airline("Moscow", "AA123", "ZUM-147", "6:00",
				new LinkedList<String>(Arrays.asList("Wednesday", "Saturday"))));
		timetable.schedule.add(new Airline("Minks", "AS654", "Sboing-569", "7:00",
				new LinkedList<String>(Arrays.asList("Sunday", "Friday"))));

		Logic logic = new Logic(); // создаем объект класса Logic
		Print print = new Print(); // создаем объект класса Print

		ArrayList<Airline> day = logic.findFlightByGivenDay(timetable.schedule, "Wednesday");// создаем глобальную
																								// переменную // точка
																								// вызова объекта на
																								// методе
																								// logic.findFlightByGivenDay//
																								// передаю объект точка ArrayList + день 
		print.print(day);
		
	}

}
