public class Customer {
    private String customerId;
    private String name;
    private String address;

    public Customer(String customerID, String name, String address) {
        this.name = name;
        this.address = address;
        this.customerId = customerID;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printCustomer(Customer customer) {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
    }

}