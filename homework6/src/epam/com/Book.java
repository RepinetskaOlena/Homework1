package epam.com;



public class Book {
        private int id;
        private String title;
        private String author;
        private String publisher;
        private int year;
        private int page;
        private double price;


        public Book() {
        }


        public Book(int id, String title, String author, String publisher, int year, int page, double price) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.year = year;
            this.page = page;
            this.price = price;
        }



        public void setId(int id) {
            this.id = id;
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

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }


        public void view () {
            System.out.println(
                    "ID = " + id + ";"
                    + " Title = " + title + ";"
                    + " Author = " + author + ";"
                    + " Publisher = " + publisher + ";"
                    + " Year = " + year + ";"
                    + " Number of pages = " + page + ";"
                    + " Price = " + price + ";");
        }

    }