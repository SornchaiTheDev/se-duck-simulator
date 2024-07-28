package factories;

import interfaces.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createCallDuck();
    public abstract Quackable createGoose();
    public abstract Quackable createPigeon();
}
