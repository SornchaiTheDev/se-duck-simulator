// 6510405814 Sornchai Somsakul

package adapters;

import interfaces.Quackable;
import models.Goose;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
