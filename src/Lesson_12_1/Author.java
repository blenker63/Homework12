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
    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return author.equals(c2.author);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(author);
    }
}




