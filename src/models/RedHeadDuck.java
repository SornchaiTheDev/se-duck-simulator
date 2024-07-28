// 6510405814 Sornchai Somsakul

package models;

import interfaces.Quackable;

public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
