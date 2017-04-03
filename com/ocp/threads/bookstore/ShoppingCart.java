package com.ocp.threads.bookstore;

/**
 * Created by agermenos on 3/24/17.
 */
public class ShoppingCart {
    public static void main(String args[]){
        Book book = new Book("Thinking in Java");
        Thread task1 = new OnlineBuy(book); task1.start();
        Thread task2 = new OnlineReturn(book); task2.start();
        Thread task3 = new OnlineBuy(book); task3.start();

        try{
            task1.join();
            task2.join();
            task3.join();
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.printf("----\nNumber of copies: %d", book.copiesSold);
    }
}
