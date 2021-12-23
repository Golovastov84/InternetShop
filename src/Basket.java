public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public Basket() { // конструктор
        items = "Список товаров:";
        this.limit = 100000;
    }

    public Basket(int totalPricelimit) {
        this(); // вызов вышележащего конструктора. Добавляется "Список товаров"
        limit = totalPricelimit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + "\n" + items;
        this.totalPrice = totalPrice;
    }
    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if(contains_1(name)) {
            return;
        }
        if(totalPrice + count * price >= limit) {
            return;
        }
        items = items + "\n" + name + " - " + count +
                " шт. -" + price;
        totalPrice = totalPrice + count * price;
    }

    public  void clear() {
        items = "";
        totalPrice = 0;
    }

    public  int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains_1(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if(items.isEmpty()) { // проверяет пустая строка или нет
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
