package by.epam.course.simpleclasstask6;

public class Util {
	private static final int ZERO = 0;

	public static void updateHours(int hours, Time time) {
		if (!areHoursCorrect(hours)) { // проверка валидации часов !!! // проверка границ ч2
			time.setHours(0);
		} else {
			time.setHours(hours);
		}
	}

	public static void updateMinutes(int minutes, Time time) {
		if (!areMinutesOrSecondsCorrect(minutes)) { // проверка валидации минут !!! // проверка границ ч2
			time.setMinutes(0);
		} else {
			time.setMinutes(minutes);
		}
	}

	public static void updateSeconds(int seconds, int minutes, Time time) { // проверка валидации секунд !!! // check
																			
		if (!areMinutesOrSecondsCorrect(seconds)) {
			minutes = minutes + (seconds / 60);
			seconds = seconds % 60;
			seconds = seconds + minutes;
		} else if (seconds > 60) {
			time.setSeconds(seconds);
		}
	}

	private static boolean areHoursCorrect(int hours) { // вместо проверки в сеттере // проверка границ ч1
		 return ZERO <= hours && hours <= 24;
		//return hours > 0 && hours < 24;

	}

	private static boolean areMinutesOrSecondsCorrect(int number) { // вместо проверки в сеттере // проверка границ ч1
		 return ZERO <= number && number <= 60;
		//return number > 0 && number < 60;
	}
            }

 
