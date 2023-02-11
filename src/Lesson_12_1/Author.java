package Lesson_12_1;

public class Author {
    public String author;
    private String name;
    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.name + " " + this.surname;
    }
}




