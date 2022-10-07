package org.sample.generics;

public class CardBoardBox<T extends Boxable> extends Box<T>{

    @Override
    public double getTotalPrice(){
        return super.getTotalPrice()+20;
    }

}
