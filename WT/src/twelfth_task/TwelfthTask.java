package twelfth_task;

public class TwelfthTask {
    public static class Book {
        private String title;
        private String author;
        private int price;
        private static int edition;
        private int isbn;

        public Book(String title, String author, int price, int edition, int isbn) {
            this.author = author;
            this.title = title;
            this.price = price;
            this.edition = edition;
            this.isbn = isbn;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor(){
            return author;
        }

        public int getPrice() {
            return price;
        }

        public int getEdition() {
            return edition;
        }

        public int getIsbn() {
            return isbn;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            Book book = (Book) obj;
            return (title != null && title.equals(book.title)) && (author != null && author.equals(book.author) && (this.price == book.price)) ;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((title == null) ? 0 : title.hashCode());
            result = prime * result + price;
            result = prime * result + ((author == null) ? 0 : author.hashCode()); return result;

        }

        @Override
        public String toString() {
            return this.getClass() + ": " + "title: " + this.title + " author: " + this.author + " price: " + this.price + " edition: " + Book.edition;
        }

        @Override
        public Book clone() {
            return new Book(this.title, this.author, this.price, this.edition, this.isbn);
        }

        @Override
        public int compareTo(Book book) {
            return this.isbn - book.isbn;
        }
    }
  }
