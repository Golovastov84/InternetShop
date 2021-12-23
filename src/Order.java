public class Order {
    public void addProduct(Product product) {
        Product copy = new Product(product.getName(), product.getPrice()); // копия объекта
        // Product copy = product; // копия ссылки на объект
    }
}
