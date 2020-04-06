package by.epam.course.simpleclasstask5;
/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния,и метод позволяющее получить его текущее состояние.
 Написать код, демонстрирующий все возможности класса. */

public class Counter {

	private int value;
	private int min;
	private int max;

	

	public Counter(int value, int min, int max) {
		this.value = value;
		this.min = min;
		this.max = max;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void increment() {
		int temp;
		temp = value;
		temp++;
		if (temp > max) {
			value = 0;
		} else {
			value = temp;
		}

	}

	public void decrement() {

		int temp;
		temp = value;
		temp--;
		if ( temp < min) {
			value = 0;
		} else {
			value = temp;
		}

	}

}
