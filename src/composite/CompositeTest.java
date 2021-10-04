package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Як обробляти атомарний об'єкт та композицію об'єктів однаково?
 *
 * Рішення: визначити класи для композитних(Composite) і атомарних(Leaf) об'єктів таким чином, щоб вони реалізовували
 * один і той же інтерфейс(Component)
 *
 * Результат: виходить деревовидна структура
 */

public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf(4000,"HDD");
        Component mouse = new Leaf(500,"Mouse");
        Component monitor = new Leaf(8000,"Monitor");
        Component ram = new Leaf(3000,"RAM");
        Component cpu = new Leaf(9000,"CPU");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}


interface Component {
    public void showPrice();
}

class Composite implements Component {

    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com) {
        components.add(com);
    }

//    public void removeComponent(Component com) {
//        components.remove(com);
//    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c: components) {
            c.showPrice();
        }
    }
}

class Leaf implements Component {
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }
}


