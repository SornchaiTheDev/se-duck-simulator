package models;

import interfaces.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> flock;

    public Flock() {
        flock = new ArrayList<>();
    }

    public void add(Quackable quackable) {
        flock.add(quackable);
    }

    @Override
    public void quack() {
        int currentIndex = 0;
        Iterator iterator = flock.iterator();

        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            if (currentIndex == 0) {
                quackable.quack();
                quackable.quack();
                quackable.quack();
            } else {
                quackable.quack();
            }
            currentIndex++;
        }
    }
}
