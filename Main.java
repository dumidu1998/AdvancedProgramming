
public class Main {

    public static void main(String[] args) {

        // Create new PersonalCustomer object
        PersonalCustomer pcus1 = new PersonalCustomer("Anura kumara", "No.12, Maya Av, Colombo 5",
                "1485-4521-4715-4521");
        // create new CorporatCustomer object
        CorporateCustomer ccus1 = new CorporateCustomer("Abans PLC", "No 12, Galle Rd, Col-5", "Saman Kumara", 25000);

        // Create new employee object
        Employee emp1 = new Employee("Jayantha Kumara", "GR-13113");

        // Create new product object
        Product pro1 = new Product("Anchor Powdered Milk 1kg");
        // Create another new product object
        Product pro2 = new Product("Sunlight Soap Bar");

        // Create new order object
        Order ord1 = new Order(ccus1);

        // Add new orderlines to ord1
        OrderLine line1 = new OrderLine(1, 1150, ord1, pro1);
        OrderLine line2 = new OrderLine(5, 3500, ord1, pro2);

        // Print the order details
        ord1.printOrder(ord1);
        line1.printOrderline(line1);
        line1.printOrderline(line2);

    }

}
