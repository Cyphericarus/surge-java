// Create Book Object to access Book class properties through Book array index.

package other.array;

class Book {
    String name;
    double price;
    int maxNoPages;

    @Override
    public String toString() {
        return "Book [name=" + name + ", price=" + price + ", maxNoPages=" + maxNoPages + "]";
    }
}

public class BookMain {
    public static void main(String[] args) {

        Book [] books = new Book[3];

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        books[0].name = "The Art of War";
        books[1].name = "Java";
        books[2].name = "PHP";

        books[0].price = 250;
        books[1].price = 140;
        books[2].price = 560;

        books[0].maxNoPages = 240;
        books[1].maxNoPages = 620;
        books[2].maxNoPages = 190;

        for (Book book: books) {
            System.out.println(book.toString());
        }
    }
}
