package com.ocp.threads.bookstore;

/**
 * Created by agermenos on 3/24/17.
 */
public class OnlineBuy extends Thread{
    private Book book;
    public OnlineBuy(Book book){
        this.book = book;
    }
    @Override
    public void run(){
        book.newSale();
    }
}
