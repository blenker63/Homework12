package Lesson_12_1;

public class Book {
    private String title;
    private Author author;

    private int yerPublication;

    public Book(String title, Author author, int yerPublication) {
        this.title = title;
        this.author = author;
        this.yerPublication = yerPublication;
    }

    public String getTitle() {
        return this.title;
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


