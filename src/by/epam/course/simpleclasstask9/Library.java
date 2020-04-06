package by.epam.course.simpleclasstask9;

import java.util.ArrayList;

public class Library {

	ArrayList<Book> libraryBase = new ArrayList<Book>(); // создаём динамический массив

	public Library() { // конструктор без параметров
	}

	public Library(ArrayList<Book> libraryBase) { // конструктор с параметрами

		this.libraryBase = libraryBase;
	}

	public void addBook(Book book) { // метод для добавления книги в ArrayList <Book> libraryBase !!!
		this.libraryBase.add(book);
	}

	public void showBookByAuthor(String author) { // метод для вывода книги по имени автора
		System.out.println("Book is created by " + " " + author);

		for (int i = 0; i < libraryBase.size(); i++) { // цикл для ArrayList'a
			if (libraryBase.get(i).getAuthor().equals(author)) { // если какой либо элемент массива равен значению
																	// передаваемого аргумента author
				System.out.println(libraryBase.get(i).getTitle()); // выводи название книги
			}

		}

	}

	public void showBookbyPublisher(String publisher) {
		System.out.println("Book were published by " + " " + publisher);

		for (int i = 0; i < libraryBase.size(); i++) { // цикл для ArrayList'a

			if (libraryBase.get(i).getPublisher().equals(publisher)) { // если какой либо элемент массива равен значению
																		// передаваемого аргумента publisher
				System.out.println(libraryBase.get(i).getTitle() + " by " + libraryBase.get(i).getAuthor()); // выводи
																												// название
																												// книги
																												// +
																												// авторa

			}
		}

	}

	public void showBookAfterSpecificYear(int publishYear) {

		System.out.println("Book was published in  " + publishYear + ":");

		for (int i = 0; i < libraryBase.size(); i++) { // цикл для ArrayList'a
			if (libraryBase.get(i).getPublishYear() > publishYear) { // если какой либо элемент массива больше
																		// передаваемого аргумента publishYear
				System.out.println(libraryBase.get(i).getTitle() + " by " + libraryBase.get(i).getAuthor()); // выводи
																												// название
																												// книги
																												// +
																												// авторa
			}

		}
	}
}
