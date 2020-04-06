package by.epam.course.simpleclasstask4;

import java.util.Date;
/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train,
 * Добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Train {
    private String destination;
    private int trainNumber;
    private Date date;

    public Train(String destination, int trainNumber, Date date) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", date=" + date +
                '}';
    }
}