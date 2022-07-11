package com.shashi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        patient pa=new patient("marry",40,new Eye("left eye","short sighted","blue",true),
                new Eye("right eye","normal","black",true),new Heart("Heart","normal",
                65),new stomach("stomach","PUD",false),new skin("skin","burned","white",
                40));
        System.out.println("name: "+pa.getName());
        System.out.println("age: "+pa.getAge());
        Scanner sc=new Scanner(System.in);
        boolean ShouldFinish=false;
        while(!ShouldFinish){
            System.out.println("choose an organ:"+
                            "\n\t1.Left Eye"+
                             "\n\t2.Right Eye"+
                              "\n\t3.Heart"+
                             "\n\t4.Stomach"+
                             "\n\t5.Skin"+
                             "\n\t6.Quit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    pa.getLefteye().getDetails();
                    if(pa.getLefteye().isOpened()){
                        System.out.println("\t\t Close the eye");
                        if(sc.nextInt()==1){
                            pa.getLefteye().close();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("open the eye");
                        if(sc.nextInt()==1){
                            pa.getLefteye().open();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 2:
                    pa.getRighteye().getDetails();
                    if(pa.getRighteye().isOpened()){
                        System.out.println("\t\t1.Close the eye");
                        if(sc.nextInt()==1){
                            pa.getRighteye().close();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1.open the eye");
                        if(sc.nextInt()==1){
                            pa.getRighteye().open();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 3:
                    pa.getHeart().getDetails();
                    System.out.println("\t\t1.change the heart rate:");
                    if(sc.nextInt()==1){
                        System.out.println("Enter the new heart rate:");
                        int newHeartRate = sc.nextInt();
                        pa.getHeart().setRate(newHeartRate);
                        System.out.println("heart rate changed to "+pa.getHeart()
                                .getRate());
                    }else{
                        continue;
                    }
                    break;
                case 4:
                    pa.getStomach().getDetails();
                    System.out.println("\t\t1.Digest");
                    if(sc.nextInt()==1){
                        pa.getStomach().digest();
                    }else{
                        continue;
                    }
                    break;
                case 5:
                    pa.getSkin().getDetails();
                    break;
                default:
                    ShouldFinish=true;
                    break;
            }

        }
    }
}
