package twelfth_task;

import java.util.Comparator;
import twelfth_task.TwelfthTask.Book;

public class FifteenthTask {
    public class SortByTitle  implements Comparator<Book>{
        @Override
        public int compare(Book book1, Book book2) {
            if ((book1 == null) || (book2 == null)) {
                throw new IllegalArgumentException("Both books shouldn't be null");
            }

            return book1.getTitle().compareTo(book2.getTitle());
        }
    }

    public class SortByAuthor implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            if ((book1 == null) || (book2 == null)) {
                throw new IllegalArgumentException("Both books shouldn't be null");
            }
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
    }

    public class SortByTitleThenAuthor implements Comparator<Book> {
        private Comparator<Book> comparator;
        public SortByTitleThenAuthor() {
            comparator = new SortByTitle().thenComparing(new SortByAuthor());
        }

        @Override
        public int compare(Book book1, Book book2) {
            if ((book1 == null) || (book2 == null)) {
                throw new IllegalArgumentException("Both books shouldn't be null");
            }
            return comparator.compare(book1, book2);
        }
    }

    public class SortByAuthorThenTitle implements Comparator<Book> {

        Comparator<Book> comparator;

        public SortByAuthorThenTitle(){
            comparator = new SortByAuthor().thenComparing(new SortByTitle());
        }

        public int compare(Book book1, Book book2) {
            if ((book1 == null) || (book2 == null)) {
                throw new IllegalArgumentException("Both books shouldn't be null");
            }
            return comparator.compare(book1, book2);
        }
    }

    public class SortByPrice implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            if ((book1 == null) || (book2 == null)) {
                throw new IllegalArgumentException("Both books shouldn't be null");
            }
            return Integer.compare(book1.getPrice(), book2.getPrice());
        }
    }

    public class SortByAuthorThenTitleThenPrice implements Comparator<Book> {

        private  Comparator<Book> comparator;

        public SortByAuthorThenTitleThenPrice() {
            comparator = new SortByAuthorThenTitle().thenComparing(new SortByPrice());
        }

        @Override
        public int compare(Book book1, Book book2) {
            if ((book1 == null) || (book2 == null)) {
                throw new IllegalArgumentException("Both books shouldn't be null");
            }
            return comparator.compare(book1, book2);
        }
    }
}
