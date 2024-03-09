
public class TestCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer1);

        customer1.setDiscount(8);
        System.out.println(customer1);
        System.out.println("Id is: " + customer1.getId());
        System.out.println("Name is: " + customer1.getName());
        System.out.println("Discount is: " + customer1.getDiscount());

        Invoice invoice1 = new Invoice(101, customer1, 888.8);
        System.out.println(invoice1);

        invoice1.setAmount(999.9);
        System.out.println(invoice1);
        System.out.println("Id is: " + invoice1.getId());
        System.out.println("Customer is: " + invoice1.getCustomer());
        System.out.println("Customer's id is: " + invoice1.getCustomerID());
        System.out.println("Customer's name is: " + invoice1.getCustumerName());
        System.out.println("Customer's discount is: " + invoice1.getCustomerDiscount());
        System.out.printf("Amount after discount is: %.2f\n", invoice1.getAmountAfterDiscount());
    }
}