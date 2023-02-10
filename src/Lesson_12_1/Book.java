package Lesson_12_1;

public class Book {
    private String string;
    private Author author;

    private int yerPublication;

    public Book(String string, Author author, int yerPublication) {
        this.string = string;
        this.author = author;
        this.yerPublication = yerPublication;
    }

    public String getString() {
        return this.string;
    }

    public Author getAuthor() {
        return this.author;
    }

//    public String toString() {
//        return this.string;
//    }
    public int getYerPublication() {
        return this.yerPublication;
    }

    public void setYerPublication(int yerPublication) {
        this.yerPublication = yerPublication;
    }

    }


