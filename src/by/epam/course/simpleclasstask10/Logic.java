package by.epam.course.simpleclasstask10;

import java.util.ArrayList;

/* //Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного. */

public class Logic {

	public ArrayList<Airline> findFlightByGivenDestination(ArrayList<Airline> schedule, String destination) { // метод для вывода рейса по пункту назначения

		ArrayList<Airline> local = new ArrayList<Airline>(); // локальный массив 

		for (int i = 0; i < schedule.size(); i++) { // цикл 

			if (schedule.get(i).getDestination().equals(destination)) { // если  значение элемента поля экземпляра класса равна передаваемому значению 

				local.add(schedule.get(i)); // добавь в локальный массив это место назначения 
			}
		}
		return local; // верни локальный массив 

	}

	public ArrayList<Airline> findFlightByGivenDay(ArrayList<Airline> schedule, String day) { // метод для вывода рейса по дням отправления 

		ArrayList<Airline> local = new ArrayList<Airline>(); // локальный массив 

		for (int i = 0; i < schedule.size(); i++) { // цикл внешний  // не превышает размер передаваемого массива 
			
			for (int j = 0; j < schedule.get(i).getDay().size(); j++) { // цикл внутренний  // не превышает размер элемента геттера getDay передаваемого массива schedule
				
				if (schedule.get(i).getDay().get(j).equals(day)) { // если значени элемента геттера getDay равна передаваемому параметру day
					
					local.add(schedule.get(i)); // добавь в локальный массив этот день
				}
			}
		}
		return local;

	}
	
	public ArrayList<Airline> findFlightByGivenDayOfTheWeek(ArrayList <Airline> schedule, String day, String time){ // метод для вывода рейса по дням недели + время вылета
		
		ArrayList <Airline> local = findFlightByGivenDay(schedule, day); // локальный массив 
		
		for (int i = 0; i < local.size(); i++) {  // цикл внешний  // не превышает размер передаваемого массива 
			if (local.get(i).getDeparture().compareTo(time) < 0) { // если значение сравнения  элемента геттера getDeparture  и передаваемого time меньше нуля 
				local.add(schedule.get(i));  // добавь в локальный массив этот день
	}

}
		return local;
	}
}
