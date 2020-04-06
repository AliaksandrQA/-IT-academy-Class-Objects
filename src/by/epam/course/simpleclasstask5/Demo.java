package by.epam.course.simpleclasstask5;

public class Demo {

	public static void main(String[] args) {
		Counter count1 = new Counter(25, 0, 20);
		
		count1.increment();
		count1.getValue();
		System.out.println(count1.getValue());
		count1.decrement();
		System.out.println(count1.getValue());
		
		
		
	}

}
