public class Product {
    private String produtId;
    private String name;

    public Product(String id, String name) {
        this.name = name;
        this.produtId = id;
    }

    public String getProdutId() {
        return produtId;
    }

    public void setProdutId(String produtId) {
        this.produtId = produtId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printProduct(Product product) {
        System.out.println("Product Name: " + product.getName());
    }

}
