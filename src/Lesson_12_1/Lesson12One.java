package Lesson_12_1;

public class Lesson12One {

    public static void main(String[] args) {
        System.out.println( "Книга 1");

        Author gogol = new Author( "Николай", "Гоголь");
        Book viy = new Book("Вий", gogol, 1990);
        System.out.println("Название  - " + viy.getTitle());
        System.out.println("Автор - " + viy.getAuthor());
        System.out.println("Год публикации - " + viy.getYerPublication() + " год");
      System.out.println( "Книга 2");
      Author pikul = new Author( "Валентин", "Пикуль");
      Book chest = new Book("Честь имею", pikul, 1985);
        System.out.println("Название  - " + chest.getTitle());
        System.out.println("Автор - " + chest.getAuthor());
        System.out.println("Год публикации - " + chest.getYerPublication() + " год");
        chest.setYerPublication(2010);
        System.out.println("Год публикации - " + chest.getYerPublication() + " год");

        System.out.println("Сравнение авторов");
        Author writer1 = new Author("Лев", "Толстой");
        Author writer2 = new Author("Лев", "Толстой");
        Book  book1 = new Book("Война и мир", writer1, 1990);
        Book book2 = new Book("Война и мир", writer2, 2010);
        System.out.println("Сравнение авторов - " + writer1.equals(writer2));
        System.out.println("hashCode автор 1 - " + writer1.hashCode());
        System.out.println("hashCode автор 2 - " + writer2.hashCode());
        System.out.println("Сравнение книг - " + book1.equals(book2));
        System.out.println("hashCode книга 1 - " + book1.hashCode());
        System.out.println("hashCode книга 2 - " + book2.hashCode());
    }
}
