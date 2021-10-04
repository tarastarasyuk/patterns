package practice.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTestOwn {
    public static void main(String[] args) {
        // cars
    }
}

interface Component {
    public void showPrice();
}

class Composite implements Component{
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com) {
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c: components) {
            c.showPrice();
        }
    }
}

class Leaf implements Component{
    String name;
    String price;

    public Leaf(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }
}
