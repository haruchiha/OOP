public class TestBook3 {
    public static void main(String[] args){
        //test author class
        Author3 author1 = new Author3("Tah Ah Teck", "ahteck@gmail.com");
        System.out.println(author1);

        author1.setEmail("ahteck@gmail.com");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());
//        //tets book
//        Book3 book3 = new Book3("12345", "Java for dummies", author1, 8.8, 88);
//        System.out.println(book3);
//
//        book3.setPrice(9.9);
//        book3.setQty(99);
//        System.out.println(book3);
//        System.out.println("isbn is: " + book3.getName());
//        System.out.println("name is: " + book3.getName());
//        System.out.println("price is: " + book3.getPrice());
//        System.out.println("qty is: " + book3.getQty());
//        System.out.println("author is: " + book3.getAuthor());
//
//        System.out.println("author's name: " + book3.getAuthorName());
//        System.out.println("author's name: " + book3.getAuthor().getName());
//        System.out.println("author's email: " + book3.getAuthor().getEmail());
    }
}
