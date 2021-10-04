package decorator;

/**
 * Яку проблему даний патерн вирішує:
 * розширення функціональності класу не модифікуючи його
 * дотримуючись ооп принципів
 *
 * Приклад: Є товар - молоко, з заданою ціною.
 * Ми хочемо знизити ціну - але не маємо права змінювати сам клас.
 * Рішення: Зробимо знижку
 */

public class DecoratorTest {
    public static void main(String[] args) {
        Product milk = new Milk(50);

        Product milkDiscount = new MilkDiscount(new MilkDiscount(milk));

        System.out.println(milkDiscount.getPrice());
    }
}


interface Product {
    int getPrice();
}

/**
 * шаблон декоратора - і з таких ми можемо створити багато інших маленьких
 */
abstract class Decorator implements Product {
    final Product product;

    public Decorator(Product product) {
        this.product = product;
    }
}

/**
 * використання - створення декоратору
 *
 * можна створювати декоратор над декоратором
 */
class MilkDiscount extends Decorator{

    public MilkDiscount(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return this.product.getPrice() - 15;
    }
}



class Milk implements Product {
    private final int price;

    public Milk(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

