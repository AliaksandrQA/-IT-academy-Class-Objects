package by.epam.course.simpleclasstask1;

public class Demo {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		Test1 t2 = new Test1();

		t1.print();
		t2.print();

		t1.changeXY(2, 3);
		t2.changeXY(1, 3);

		t1.print();
		t2.print();

		t1.sum();
		t2.sum();

		t1.max();
		t2.max();
		
		int sumFirst= t1.sum();
		int sumSecond = t2.sum();
		
		System.out.println(sumFirst);
		System.out.println(sumSecond);
		
		int maxFirst = t1.max();
		int maxSeconds = t1.max();
		
		System.out.println(maxFirst);
		System.out.println(maxSeconds);

		

	}

}
