package com.example.asiantech.designpatterndemo.mediator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.asiantech.designpatterndemo.R;

public class MediatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);
        StockMediator nyse = new StockMediator();
        GormanSlacks broker = new GormanSlacks(nyse,200);
        JTPoorman broker2 = new JTPoorman(nyse,200);
        broker.saleOffer("MSFT", 100);
        broker.saleOffer("GOOG", 50);
        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);
        broker.buyOffer("NRG", 10);
        nyse.getstockOfferings();

    }
}
