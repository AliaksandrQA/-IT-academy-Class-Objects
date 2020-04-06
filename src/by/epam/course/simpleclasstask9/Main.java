package by.epam.course.simpleclasstask9;

/*  Создать класс Book, спецификация которого приведена ниже.
 * 
 *  Определить конструкторы, set- и get- методы и метод  toString().
 *  
 *  Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 *  
 Задать критерии выбора данных и вывести эти данные на консоль.
 Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 Найти и вывести:
  a) список книг заданного автора;
  b) список книг, выпущенных заданным издательством;
  c) список книг, выпущенных после заданного года.*/

public class Main {

	public static void main(String[] args) {
		
		Library reading = new Library();
		
		reading.libraryBase.add(new Book (1, " Harry Potter and the Philosopher's Stone", "Rowling", "Midnight", 2002, 654, 30, "hard"));
		reading.libraryBase.add(new Book (2, " The Lord of the Rings", "Talkien", "Sunshine", 2004, 900, 64, "hard"));
		reading.libraryBase.add(new Book (3, " The Lord of the flies", "Johnson", "MorningStar", 1999, 300, 15, "hard"));
		reading.libraryBase.add(new Book (4, " The Witcher", "Sapkouski", "PolskaBook", 2000, 756, 100, "hard"));
		
		
		reading.showBookByAuthor("Sapkouski");
		System.out.println("");
		
		reading.showBookbyPublisher("MorningStar");
		System.out.println();

		reading.showBookAfterSpecificYear(2001);

		

	}

}
