package org.example;
/**
 * 6510450917 Lerdphipat Kanjanarungroj
 */
public class PigeonAdapter implements Quackable{
    Pigeon pigeon;
    public PigeonAdapter(Pigeon pigeon){
        this.pigeon = pigeon;
    }

    public void quack(){
        pigeon.coo();
        pigeon.coo();
    }
}
