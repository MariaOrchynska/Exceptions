package com.company;

import java.util.Scanner;

public class Pizza {
    Scanner sc = new Scanner(System.in);
    public void call() {
        System.out.println("Enter a number : ");
        int numOfPizza = sc.nextInt();

        if (numOfPizza<=5 ) {
            System.out.println("We can make your order ...");
        }else {
            try {
                 throw new CookIsBusyException(numOfPizza);
            }  catch (CookIsBusyException e) {
                System.out.println("The cook  is busy :((( Yoy have ordered too many pizzas");
            }
        }
    }
}