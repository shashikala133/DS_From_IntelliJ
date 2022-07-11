package com.shashi;

import java.util.Random;
import java.util.Scanner;

public class guessing_game {
    public static void main(String[] args){
        System.out.println("welcome to the game");
        System.out.println("may i have your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("hello  "+name);
        System.out.println("shall we start?");
        System.out.println("\tpress 1.yes");
        System.out.println("\tpress 2.no");
        int c=sc.nextInt();
        while(c!=1){
            System.out.println("shall we begin?");
            System.out.println("\tpress 1.yes");
            System.out.println("\tpress 2.no");
            c=sc.nextInt();
        }
        Random random=new Random();
        int guess = random.nextInt(20)+1;
        System.out.println("guess the number: ");
        int userInput=sc.nextInt();
        boolean finish=false;
        int count=0;
        boolean won=false;
        while (!finish){
            count++;
            if(count<5){
                if(userInput==guess){
                    won=true;
                    finish=true;
                }
                else if(userInput>guess){
                    System.out.println("guess lower ");
                    userInput=sc.nextInt();
                }
                else{
                    System.out.println("guess higher");
                    userInput=sc.nextInt();
                }
            }else{
                finish=true;
            }
        }
        if(won){
            System.out.println("congrajulations!!! you have guessed in your "+count+" guess");
        }else {
            System.out.println("game over!!!");
            System.out.println("the number was "+guess);
        }
    }
}
