import controllers.DuckSimulator;
import factories.AbstractDuckFactory;
import factories.CountAndPoliteDuckFactory;
import factories.CounterDuckFactory;
import factories.NoDecoratorDuckFactory;

public class Main {
    public static void main(String[] args) {
        AbstractDuckFactory factory = new NoDecoratorDuckFactory();
//        AbstractDuckFactory factory = new CounterDuckFactory();
//        AbstractDuckFactory factory = new CountAndPoliteDuckFactory();
        DuckSimulator simulator = new DuckSimulator(factory);
        simulator.simulate();
    }
}