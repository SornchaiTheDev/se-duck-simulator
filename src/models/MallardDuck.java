// 6510405814 Sornchai Somsakul

package models;

import interfaces.Quackable;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("MallardQuack");
    }
}
