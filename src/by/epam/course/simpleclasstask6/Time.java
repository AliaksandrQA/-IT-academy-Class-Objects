package by.epam.course.simpleclasstask6;

/* Составьте описание класса для представления времени.
 * 
 *  Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 *  
 *  В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
количество часов, минут и секунд.*/

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {

		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "Time{" + "hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + '}';
	}
}
