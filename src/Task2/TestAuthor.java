package Task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Greg", "greg1234@gmail.com", 'M');

        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        author.setEmail("new_greg1234@gmail.com");
        System.out.println(author);
    }
}
