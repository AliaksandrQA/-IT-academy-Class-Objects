package by.epam.course.simpleclasstask1;

/* Создайте класс Test1 двумя переменными. 
 * Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, 
 * и 
 * метод, который находит наибольшее значение из этих двух переменных.*/

public class Test1 {

	private int x;
	private int y;

	public void changeXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;

	}

	public void setY(int y) {
		this.y = y;
	}

	public int sum() {
		int sum;
		sum = x + y;
		return sum;
	}

	public int max() {
		int max;
		max = Math.max(x, y);
		return max;
	}

	public void print() {
		System.out.println("x = " + x + ", y = " + y);
}

}
