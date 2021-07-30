public class OrderLine {
    private String lineId;
    private float quantity;
    private float price;
    private Order order;
    private Product product;

    public OrderLine(float quantity, float price, Order order, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.order = order;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getQuantity() {
        return quantity;
    }

    public void printOrderline(OrderLine orderline) {
        orderline.getProduct().printProduct(orderline.getProduct());
        System.out.println("Unit Price: " + orderline.getPrice());
        System.out.println("Quantity: " + orderline.getQuantity());

    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}