package org.example;
/**
 * 6510450917 Lerdphipat Kanjanarungroj
 */
public class CountingPoliteDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createDuckCall() {
        return new PoliteDecorator(new DuckCall());
    }

    @Override
    public Quackable createMallardDuck() {
        return new PoliteDecorator(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new PoliteDecorator(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteDecorator(new RubberDuck());
    }
}
