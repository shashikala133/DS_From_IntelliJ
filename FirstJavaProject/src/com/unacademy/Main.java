package com.unacademy;

public class Main {

    public static void main(String[] args) {
     ReadCompany mydreamcompany = new ReadCompany();
     mydreamcompany.setCompanyName("google");
     mydreamcompany.setLocation("bangalore");
     mydreamcompany.setPackageInLacks(50);
     mydreamcompany.doWork();
    }
}
