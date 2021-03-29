package Fruits;

import Fruits.Apple;
import Fruits.Box;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox= new Box<>(apple);
        Box<Orange> orangeBox = new Box<>(orange);

        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        orangeBox.addFruit(orange);


        Box<Apple>  appleBox1=new Box<>();

        appleBox.moveFruitsTo(appleBox1);

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox.getWeight());

    }
}
