package Lesson_12_1;

import java.util.Objects;

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

    public int getYerPublication() {
        return this.yerPublication;
    }

    public void setYerPublication(int yerPublication) {
        this.yerPublication = yerPublication;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author); // сравнение без учета года публикации
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Книга: " +
                "название - " + title  +
                ", автор - " + author +
                ", год публикации - " + yerPublication;
    }
}



