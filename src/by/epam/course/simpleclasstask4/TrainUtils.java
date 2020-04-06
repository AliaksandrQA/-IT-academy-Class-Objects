package by.epam.course.simpleclasstask4;

import java.util.Arrays;
import java.util.Comparator;

public class TrainUtils {
    public static Train[] sortByNumber(Train[] trains) {

        Arrays.sort(trains, new Comparator<Train>() {
            public int compare(Train train1, Train train2) {
                return Integer.compare(train1.getTrainNumber(), train2.getTrainNumber());// сортировка
            }
        });
        return trains;

    }

    public static void printTrainInfo(Train[] trains, int trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                System.out.println("Your train arrives " + train.getDestination() + " " + train.getDate());
                return;

            }


        }
        System.out.println("Such train number doesn't exist");
    }

    public static void sortDestinationandDate(Train[] trains) {

        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) { // сравнение по строкам // указываю объекты для сравнения
                return o1.getDestination().compareTo(o2.getDestination()); // сортировка
            }
        });
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getDestination().equals(o2.getDestination())) { // если направления совпадают 
                    return o1.getDate().compareTo(o2.getDate()); // сортируй по дате прибытия 
                }
                return 0;
            }
        });

    }

}