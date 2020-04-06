package by.epam.course.simpleclasstask10;

import java.util.ArrayList;

public class Print {
public void print(ArrayList <Airline> schedule) {
		
		for (int i = 0; i < schedule.size(); i++) {
			System.out.println(schedule.get(i).toString());
		}
	}

}


