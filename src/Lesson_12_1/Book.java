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

    public String getString() {
        return this.string;
    }

    public String getAuthor() {
        return this.author;
    }
    public int getYerPublication() {
        return this.yerPublication;
    }

    public void setYerPublication(int yerPublication) {
        this.yerPublication = yerPublication;
    }
}
