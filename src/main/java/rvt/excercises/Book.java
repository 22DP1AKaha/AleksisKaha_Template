package rvt.excercises;

public class Book implements Packable{
    String author;
    String BookName;
    double weight;

    public Book(String author, String BookName, double weight){
        this.author = author;
        this.BookName = BookName;
        this.weight = weight;
    }
    public String author(){
        return author;
    }
    public String BookName(){
        return BookName;
    }
    public double weight(){
        return weight;
    }

    public String toString() {
        return this.author + ": " + this.BookName;
    }
}
