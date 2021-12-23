public class GetName {
    public static void main(String[] args) {
        /*Product a = new Product("молоко", 56);
        Product b = a;
        a.setName("Сок");
        System.out.println(a);
        System.out.println(b);*/
        Product product = new Product("молоко", 56);
        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);
    }
}
