package by.epam.course.simpleclasstask4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-2015 10:20:56";
		Date date1 = sdf.parse(dateInString);

		String dateInString2 = "1-09-1983 10:20:56";
		Date date2 = sdf.parse(dateInString2);

		Train[] trains = new Train[5];
		trains[0] = new Train("Moscow", 1, new Date());
		trains[1] = new Train("Gomel", 231, date1);
		trains[2] = new Train("Minsk", 3, new Date());
		trains[3] = new Train("Gomel", 22, date2);
		trains[4] = new Train("Mogilev", 123, new Date());

		TrainUtils.sortByNumber(trains);

		System.out.print(Arrays.toString(trains));

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter trains number");

		int x = scan.nextInt();

		TrainUtils.printTrainInfo(trains, x);
		TrainUtils.sortDestinationandDate(trains);
		System.out.println(Arrays.toString(trains));

	}
}