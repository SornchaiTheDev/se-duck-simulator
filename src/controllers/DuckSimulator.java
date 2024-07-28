// 6510405814 Sornchai Somsakul

package controllers;

import decorators.QuackCounter;
import factories.AbstractDuckFactory;
import interfaces.Quackable;
import models.*;

public class DuckSimulator {

    AbstractDuckFactory factory;

    public DuckSimulator(AbstractDuckFactory factory) {
        this.factory = factory;
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }

    public void simulate() {
        Flock flockOfMallardDuck = new Flock();

        flockOfMallardDuck.add(factory.createMallardDuck());
        flockOfMallardDuck.add(factory.createMallardDuck());
        flockOfMallardDuck.add(factory.createMallardDuck());
        flockOfMallardDuck.add(factory.createMallardDuck());

        System.out.println("Flock of Mallard Duck");
        simulate(flockOfMallardDuck);

        Flock flockOfRedHeadDuck = new Flock();

        flockOfRedHeadDuck.add(factory.createRedHeadDuck());
        flockOfRedHeadDuck.add(factory.createRedHeadDuck());
        flockOfRedHeadDuck.add(factory.createRedHeadDuck());
        flockOfRedHeadDuck.add(factory.createRedHeadDuck());

        System.out.println("Flock of Red Head Duck");
        simulate(flockOfRedHeadDuck);

        System.out.println("The polite duck quacked " + QuackCounter.getCount() + " times.");

    }
}
