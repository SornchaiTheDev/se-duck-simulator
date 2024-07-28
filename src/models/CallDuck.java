package models;

import interfaces.Quackable;

public class CallDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kuack");
    }
}
