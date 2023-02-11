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
}
}
