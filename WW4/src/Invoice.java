
public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.customer.getId();
    }

    public String getCustumerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        this.amount = this.amount - this.amount * this.customer.getDiscount() * 0.01;
        return this.amount;
    }

    public String toString() {
        String strCustomer = this.customer.toString();
        return "Invoice[id= " + this.id + ", customer= " + strCustomer + ", amount=" + this.amount;
    }
}