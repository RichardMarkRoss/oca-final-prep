package oca.lambdas;


import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

class Apple {
    private String color;
    private double price;
    private int weight;

    public Apple(String color, double price, int weight) {
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}

public class AboutPredicatesWithObjects {
    public static void main(String[] args) {

        Apple[] apples = {new Apple("Red", 2.44, 67),
                new Apple("Green", 5.44, 78),
                new Apple("Yellow", 6.44, 34),
                new Apple("Red", 1.44, 71),
                new Apple("Green", 4.564, 27),
                new Apple("Red", 6.44, 45)
        };

        Predicate<Apple> printApplelighterThen50 = apple -> apple.getWeight() < 50;
        Predicate<Apple> printGreenApples = apple -> apple.getColor().equalsIgnoreCase("Green");
        Predicate<Apple> printApplesCheaperThan550 = (apple) -> apple.getPrice() < 5.50;

        for (int i = 0; i < apples.length; i++) {
            if (printApplelighterThen50.test(apples[i])) {
                System.out.println(apples[i].getColor() + " " + i + " apple is lighter than 50");
            } else if (printGreenApples.test(apples[i])) {
                System.out.println(apples[i].getPrice() + " " + i + " apple is lighter than 50");
            } else if (printApplesCheaperThan550.test(apples[i])) {
                System.out.println(apples[i].getWeight() + " " + i + " apple is lighter than 50");
            } else {
                System.out.println("return");
            }
        }
    }
}
