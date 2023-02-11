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

    public int getYerPublication() {
        return this.yerPublication;
    }

    public void setYerPublication(int yerPublication) {
        this.yerPublication = yerPublication;
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
        return java.util.Objects.hash(title);
    }

    @Override
    public String toString() {
        return title + "  " + author;
    }
}


