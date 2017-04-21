package com.ocp.strings;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by agermenos on 3/9/17.
 */
public class ScannerTest {
    public static void main(String args[]){
        String strPattern="(ABC)+[\\d]+\\.[\\d]+[\\d]+";
        String strSource = "ABC 223.2343 Paul 10";
        Scanner scanner = new Scanner(strSource);
        scanner.findInLine(strPattern);

        System.out.println(scanner.next());
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());
        System.out.println(scanner.nextInt());
    }

    @Test
    public void test2(){
        String in = "1 a 10 . 100 1000";
        Scanner s = new Scanner(in);
        s.findInLine("[\\d]+[a]+[\\d]+[\\W]+[\\d]+[\\d]+");
        int accum = 0;
        for(int x = 0; x < 4; x++) {
            accum += s.nextInt();
        }
        System.out.println(accum);
    }
}
