package org.example;
/**
 * 6510450917 Lerdphipat Kanjanarungroj
 */
public class PoliteDecorator implements Quackable{
    Quackable component;
    public static int numberofPoliteQuack;
    PoliteDecorator(Quackable component){
        this.component = component;
        numberofPoliteQuack = 0;
    }
    @Override
    public void quack() {
        component.quack();
        System.out.println("kub");
        numberofPoliteQuack++;
    }

    public static int getNumberofPoliteQuack() {
        return numberofPoliteQuack;
    }
}
