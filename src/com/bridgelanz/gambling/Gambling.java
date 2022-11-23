package com.bridgelanz.gambling;
import java.util.Random;
public class Gambling {
    static int Stake = 100;
    static int Bet = 1;

    public static void main(String[] args) {
        int day =1;
        System.out.println("!!!Welcome to the Gambling Game!!!");
        int result;
        Random r = new Random();
        int rand = r.nextInt(2);

        System.out.println("You currently have: $"+Stake);
        if (rand == 1){
            System.out.println("You Won the Game");
            result = Stake + Bet;
        }
        else {
            System.out.println("You Lost the Game");
            result = Stake - Bet;
        }
        System.out.println("Your have: $"+result + " now !!");
    }
    }

