package com.unacademy;
import java.util.Scanner;
public class inputReader {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
     System.out.println("enter your marks");
     int mark = sc.nextInt();

     System.out.println("my name is :" +name + "mrks is: "+mark);
     sc.close();
    }
}
