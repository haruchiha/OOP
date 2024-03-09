public class TestAuthor {
    public static void main(String[] args){
        Author ahTeck = new Author("Tan AhTeck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99); //test book's contructor
        System.out.println(dummyBook); //test book's toSTring()

        //test getter setter
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());  //author's toSTring

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@gamil.com", 'm'), 29.95);
        System.out.println(anotherBook);  //toSTring


    }
}
