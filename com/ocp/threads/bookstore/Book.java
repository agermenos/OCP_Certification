package com.ocp.threads.bookstore;

/**
 * Created by agermenos on 3/24/17.
 */
public class Book {
    String title;
    int copiesSold=0;
    public Book(String title){
        this.title=title;
    }
    synchronized public void newSale(){
        System.out.printf("SALE: Original value:%d\tNew value:%d\n", copiesSold, ++copiesSold);
    }
    synchronized public void newReturn(){
        System.out.printf("RETURN: Original value:%d\tNew value:%d\n", copiesSold, --copiesSold);
    }

}
