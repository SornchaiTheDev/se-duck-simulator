// 6510405814 Sornchai Somsakul

package decorators;

import interfaces.Quackable;

public class PoliteQuack implements Quackable {
    Quackable bird;

    public PoliteQuack(Quackable bird) {
        this.bird = bird;
    }

    @Override
    public void quack() {
        bird.quack();
        System.out.println("krub");
    }
}
