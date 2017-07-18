package com.example.asiantech.designpatterndemo.mediator;

/**
 * Colleague
 *
 * @author at-ToanNguyen
 */

public abstract class Colleague {
    private Mediator mediator;
    private int colleagueCode;

    public Colleague(Mediator mediator, int colleagueCode) {
        this.mediator = mediator;
        this.colleagueCode = colleagueCode;
    }

    public void saleOffer(String stock, int shares) {
        mediator.saleOffer(stock, shares, this.colleagueCode);
    }

    public void buyOffer(String stock, int shares) {
        mediator.buyOffer(stock, shares, this.colleagueCode);
    }

    public void setCollCode(int collCode) {
        colleagueCode = collCode;
    }

}
