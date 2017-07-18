package com.example.asiantech.designpatterndemo.mediator;

import android.util.Log;

import java.util.ArrayList;

/**
 * StockMediator
 *
 * @author at-ToanNguyen
 */

public class StockMediator implements Mediator {
    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSaleOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSaleOffers = new ArrayList<StockOffer>();
    }

    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
        colleagueCodes++;
        newColleague.setCollCode(colleagueCodes);
    }

    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;
        for (StockOffer offer : stockBuyOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)) {
                Log.d("GGGGGGG",shares + " shares of " + stock +
                        " sold to colleague code " + offer.getCollCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if (stockSold) {
                break;
            }
        }
        if (!stockSold) {
            Log.d("GGGGGGG",shares + " shares of " + stock +
                    " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockSaleOffers.add(newOffering);
        }
    }

    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;
        for (StockOffer offer : stockSaleOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)) {
                Log.d("GGGGGGG",shares + " shares of " + stock +
                        " bought by colleague code " + offer.getCollCode());
                stockSaleOffers.remove(offer);
                stockBought = true;
            }
            if (stockBought) {
                break;
            }
        }
        if (!stockBought) {
            Log.d("GGGGGGG",shares + " shares of " + stock +
                    " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockBuyOffers.add(newOffering);
        }
    }

    public void getstockOfferings() {
        Log.d("GGGGG","\nStocks for Sale");
        for (StockOffer offer : stockSaleOffers) {
            Log.d("GGGGG",offer.getstockShares() + " of " + offer.getStockSymbol());
        }
        Log.d("GGGGG","\nStock Buy Offers");
        for (StockOffer offer : stockBuyOffers) {
            Log.d("GGGGG",offer.getstockShares() + " of " + offer.getStockSymbol());
        }
    }

}
