package decorators;

import interfaces.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    private static int count;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }

    public static int getCount() {
        return count;
    }

}
