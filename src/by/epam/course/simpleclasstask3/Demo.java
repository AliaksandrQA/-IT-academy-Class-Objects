package by.epam.course.simpleclasstask3;

public class Demo {

	public static void main(String[] args) {

		int size = 10;

		Student[] students = new Student[size];

		students[0] = new Student("Ivan","Ivanov", 12,(new int[] { 4, 4, 5, 3, 5 }));
		students[1] = new Student("Ivan","Sidorov", 12,(new int[] { 5, 5, 4, 4, 5 }));
		students[2] = new Student("Ivan","Petrov", 12,(new int[] { 10, 9, 10, 9, 9 }));
		students[3] = new Student("Ivan","Robkin", 12,(new int[] { 10, 8, 10, 8, 9 }));
		students[4] = new Student("Ivan","Dobrov", 12,(new int[] { 10, 10, 10, 10, 10 }));
		students[5] = new Student("Ivan","Zlobin", 12,(new int[] { 9, 9, 9, 9, 9 }));
		students[6] = new Student("Ivan","Bookin", 12,(new int[] { 9, 9, 9, 9, 10 }));
		students[7] = new Student("Ivan","Borutov", 12,(new int[] { 9, 8, 8, 9, 10 }));
		students[8] = new Student("Ivan","Narutov", 12,(new int[] { 7, 8, 8, 9, 7 }));
		students[8] = new Student("Ivan","Brutto", 12,(new int[] {10, 10, 9, 9, 5 }));
		students[9] = new Student("Ivan","Brutto", 12,(new int[] { 5, 5, 9, 9, 5 }));
		
		
		Student[] perfectStudents = Student.findTeachersPet(students); // глобальная переменная
		
		Student.printStudents(perfectStudents);
		

	}

}
