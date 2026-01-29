
package library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Author author2 = new Author("Martin", "Camaj");
        Author author1 = new Author("Ismail", "Kadare");
        
        Book book1 = new Book("2634b", "Gjenerali i ushtrise se vdekur", author1);
        Book book2 = new Book("2414", "Prilli i thyer", author1);
        Book book3 = new Book("1354854", "Dranja", author2);


        Library library = new Library();

         library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
     
//        try{
//           
//            
//        }catch (IllegalArgumentException exception){
//            System.out.println(exception.getMessage());
//        }
//
//        try {
//            library.findBook("15638");
//        }catch (BookNotFoundException exception){
//            System.out.println(exception.getMessage());
//        }
//
        try{
            System.out.println("Best author: " + library.mostProductiveAuthor());
        } catch (BookNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

//        try{
//         // ArrayList<Book> booksFound =   library.listOfBooksByAuthor(author2);
//        	 ArrayList<Book> booksFound =   library.listOfBooksByAuthor(new Author("Martin", "Camaj"));
//          System.out.println("U gjeten " + booksFound.size() + " libra.");
//            for(Book book: booksFound) {
//            	System.out.println(book);
//            }
//        }catch (BookNotFoundException exception){
//            System.out.println(exception.getMessage());
//        }

    }
}