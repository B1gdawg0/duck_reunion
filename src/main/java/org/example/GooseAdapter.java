package org.example;
/**
 * 6510450917 Lerdphipat Kanjanarungroj
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    public void quack() {
        goose.honk();
    }
}
