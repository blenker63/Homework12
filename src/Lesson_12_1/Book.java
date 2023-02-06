package Lesson_12_1;

public class Book {
    private String string;
    private String author;
    private int yerPublication;

    public Book(String string, String author, int yerPublication) {
        this.string = string;
        this.author = author;
        this.yerPublication = yerPublication;
    }

    public String string() {
        return this.string;
    }

    public String author() {
        return this.author;
    }
    public int getYerPublication() {
        return this.yerPublication;
    }
}
