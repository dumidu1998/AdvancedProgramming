public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer printOrder(Order order) {
        customer.printCustomer(order.getCustomer());
        return new Customer(customer.getName(), customer.getAddress()); // one na
    }

}
