package first;

public class TestBook {
    public static void main(String[] args) {
        Book firstBook = new Book();
        Book secondBook = new Book("Bob's adventure");
        Book thirdBook = new Book(300);
        Book fourthBook = new Book("Mike's life", 500);

        secondBook.setCost(400);
        thirdBook.setName("Helen's trip");
        System.out.println(firstBook);
    }
}
