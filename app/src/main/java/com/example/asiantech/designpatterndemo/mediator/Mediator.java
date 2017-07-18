package com.example.asiantech.designpatterndemo.mediator;

/**
 * Mediator
 *
 * @author at-ToanNguyen
 */

public interface Mediator {
    void saleOffer(String stock, int shares, int collCode);

    void buyOffer(String stock, int shares, int collCode);

    void addColleague(Colleague colleague);
}
