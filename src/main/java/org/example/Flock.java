package org.example;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 6510450917 Lerdphipat Kanjanarungroj
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();

        if (iterator.hasNext()) {
            Quackable firstQuacker = iterator.next();
            for (int i = 0; i < 3; i++) {
                firstQuacker.quack();
            }

            while (iterator.hasNext()) {
                Quackable quacker = iterator.next();
                quacker.quack();
            }
        }
    }
}
