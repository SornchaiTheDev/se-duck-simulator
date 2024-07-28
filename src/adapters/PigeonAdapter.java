// 6510405814 Sornchai Somsakul

package adapters;

import interfaces.Quackable;
import models.Pigeon;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;
    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
