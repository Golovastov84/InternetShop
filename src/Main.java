public class Main {
    public static void main(String[] args) {
        String product = "Бананы";

        Basket vasyaBasket = new Basket(200);
        vasyaBasket.add("Колбаса", 76, 2);
        vasyaBasket.add("Молоко", 55);
        vasyaBasket.add("Молоко", 55);
        vasyaBasket.add("Масло", 120);
        //vasyaBasket.print("Содержимое корзины: ");
        System.out.println("Общая стоимость товаров: " + vasyaBasket.getTotalPrice());
        System.out.println("В корзине есть " + product + "? " + (vasyaBasket.contains_1(product)?"Есть":"Нет"));
        System.out.println();
        /*vasyaBasket.print("Содержимое корзины: ");
        int totalPrice_1 = vasyaBasket.getTotalPrice(); // Другой вариант вызова метода getTotalPrice()
        System.out.println("Общая стоимость товаров: " + totalPrice_1);*/
        //vasyaBasket.clear();
        System.out.println();

        Basket petyaBasket = new Basket(500);
        // Basket petyaBasket = new Basket(); // или так
        petyaBasket.add("Лопата", 400);
        petyaBasket.add("Бочка", 2300);
        /*vasyaBasket.print("Содержимое корзины: ");
        System.out.println("Общая стоимость товаров: " + petyaBasket.getTotalPrice());
        System.out.println("В корзине есть " + product + "? " + (petyaBasket.contains_1(product)?"Есть":"Нет"));*/

        Basket mashaBasket = new Basket("Стол", 5000); // вызов конструктора

        vasyaBasket.print("Корзина Васи:");
        System.out.println();
        petyaBasket.print("Корзина Пети:");
        System.out.println();
        mashaBasket.print("Корзина Маши:");


    }
}
