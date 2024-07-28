// 6510405814 Sornchai Somsakul

package factories;

import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import interfaces.Quackable;
import models.*;

public class NoDecoratorDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createCallDuck() {
        return new CallDuck();
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

    @Override
    public Quackable createPigeon() {
        return new PigeonAdapter(new Pigeon());
    }
}
