package by.epam.course.simpleclasstask3;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
пяти элементов). 
Создайте массив из десяти элементов такого типа. 
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Student {

	private String name;
	private String surname;
	private int groupNumber;
	private int[] perfomance = new int[5];
	
	

	public Student(String name, String surname, int groupNumber, int[] perfomance) {
		super();
		this.name = name;
		this.surname = surname;
		this.groupNumber = groupNumber;
		this.perfomance = perfomance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getPerfomance() {
		return perfomance;
	}

	public void setPerfomance(int[] perfomance) {
		this.perfomance = perfomance;
	}
	
	public static void printStudents(Student [] arr) { // получает массив студентов// и выводит их значение 
		
		for( Student student : arr) { // тип массива(String) // student - название переменной //
			System.out.println((student.getName()+" " + student.getSurname() + " "+student.getGroupNumber()));
		}
	}
	public static Student[] findTeachersPet ( Student[] students) { //найти отличников // 
		
		Student[] TeachersPet = new Student[students.length]; // локальный массив// размер локального массива = той же длины что и массив students
		
		int i = 0;
		for ( Student student : students) { // for each // перебор студентов из массива students
			if(isPerfectStudent(student)) { // если какой либо студент отличник//  
				TeachersPet[i] = student; // помести этого студента в массив TeachersPet // массив ТОЛЬКО отличников сформирован 
				i++; 
			}
		}
		if ( i == students.length) { // если после цикла   i == students.length значит массив заполнен только отличниками
			return TeachersPet;  // если i != students.length значит в переменной i хранится реальное значение отличников - > 
		}
		Student [] result = new Student[i]; // ->> тогда создаём новый массив размера i 
		for ( i = 0; i < result.length;i++) { // length присвоен 
			result[i] = TeachersPet[i];  // присвоить найденных отличников новому массив result
		}
		return result;
	}

	public static boolean isPerfectStudent(Student st) { // получает студента // метод говорит отличник ли этот студент
		int [] marks;
		
		marks = st.getPerfomance(); // массив marks принимает значения успеваемости 
		for( int performance : marks) { // for each // перебираю его все оценки 
			if ( performance < 9) { // если какая либо оценка меньше 9 
				return false; // верни false
				
			}
		} return true;
	} 
}
