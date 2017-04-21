package com.ocp.threads.bookstore;

/**
 * Created by agermenos on 3/24/17.
 */
public class OnlineReturn extends Thread {
    private Book book;
    public OnlineReturn(Book book){
        this.book=book;
    }
    @Override
    public void run(){
        book.newReturn();
    }
}
