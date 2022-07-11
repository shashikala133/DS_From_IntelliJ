package com.unacademy;

public class ReadCompany {
    private String companyName;
    private String location;
    private int packageInLacks;
    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPackageInLacks() {
        return packageInLacks;
    }

    public void setPackageInLacks(int packageInLacks) {
        this.packageInLacks = packageInLacks;
    }
    public void doWork(){
        System.out.println("i'm working in my dream company " + companyName);
    }
}
