package by.epam.course.simpleclasstask8;

import java.util.ArrayList;
import java.util.List;

public class View {

	public void printBase(List<Customer> base) {
		for (Customer client : base) {
			System.out.println(client.toString());
		}

		System.out.println();
	}

}
