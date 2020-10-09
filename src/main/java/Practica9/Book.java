package Practica9;

public class Book {
    private String title;
    private String publisher;
    private String author;
    private int publishingYear;



    public Book(String title, String publisher, int publishingYear) {
        this.title = title;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
    }
    public Book(String title, String author, String publisher, int publishingYear) {
        this.title = title;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.author = author;
    }
    public void printBook (){
        System.out.println(this.title + ", " +this.author + ", "+this.publisher + ", " + this.publishingYear + ".");
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
