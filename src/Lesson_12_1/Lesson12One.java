package Lesson_12_1;

public class Lesson12One {

    public static void main(String[] args) {
        System.out.println( "Книга 1");

        Author gogol = new Author( "Николай", "Гоголь");
        Book viy = new Book("Вий", "Гоголь", 1990);
        System.out.println("Название  - " + viy.string());
        System.out.println("Автор - " + viy.author());
        System.out.println("Автор - " + gogol.Name() + " " + gogol.Surname());
        System.out.println("Год публикации - " + viy.getYerPublication() + " год");
    }
}
