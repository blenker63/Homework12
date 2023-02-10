package Lesson_12_1;

public class Author {
    private String name;
    private String surname;
    private String author;

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



