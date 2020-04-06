package by.epam.course.simpleclasstask9;
 
/*  Создать класс Book, спецификация которого приведена ниже. - > checked 
 * 
 *  Определить конструкторы, set- и get- методы и метод  toString(). - > checked 
 *  
 *  Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 *  
 Задать критерии выбора данных и вывести эти данные на консоль.
 Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 Найти и вывести:
  a) список книг заданного автора;
  b) список книг, выпущенных заданным издательством;
  c) список книг, выпущенных после заданного года.
  */

public class Book {

	private int id;
	private String title;
	private String author;
	private String publisher;
	private int publishYear;
	private int pages;
	private int price;
	private String cover;

	public Book() {

	}

	public Book(int id) {
		super();
		this.id = id;
	}

	public Book(int id, String title, String author, String publisher, int publishYear, int pages, int price,
			String cover) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.pages = pages;
		this.price = price;
		this.cover = cover;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publishYear=" + publishYear + ", pages=" + pages + ", price=" + price + ", cover=" + cover + "]";
	}
	

}
