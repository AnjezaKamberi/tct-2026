package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Author> authors;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book was successfully added to your library!");
        System.out.println(book);
    }

    public ArrayList<Book> listOfBooksByAuthor(Author author) throws BookNotFoundException{
        if (books.isEmpty()) {
            throw new BookNotFoundException("There are no books found in this Library!");
        }

        ArrayList<Book> booksByAuthor = new ArrayList<>();

        for(Book book: books){
            if(book.getAuthor().equals(author)){
                booksByAuthor.add(book);
            }
        }

        if (booksByAuthor.isEmpty()) {
            throw new BookNotFoundException("No books found by author: " + author.getName());
        }

        return booksByAuthor;
    }


    public void findBook(String id)  {
        boolean found = false;
        for(Book book: books){
            if(id.equals(book.getId())){
                System.out.println("Book is available in the library!");
                System.out.println(book);
                found = true;
                break;
            }
        }
        if(!found){
            throw new BookNotFoundException("Book is currently not available :(");
        }
    }

    public Author mostProductiveAuthor() throws BookNotFoundException {
        if (books.isEmpty()) {
            throw new BookNotFoundException("There are no books found in this Library!");
        }

        Author mostProductive = null;
        int maxBooks = 0;

        for (Book book : books) {
            Author currentAuthor = book.getAuthor();
            int count = 0;

            for (Book b : books) {
                if (b.getAuthor().equals(currentAuthor)) {
                    count++;
                }
            }

            if (count > maxBooks) {
                maxBooks = count;
                mostProductive = currentAuthor;
            }
        }

        return mostProductive;
    }



}

