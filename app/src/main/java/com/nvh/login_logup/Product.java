package com.nvh.login_logup;

public class Product {

    private String productName, address;

    // Image name (Without extension)
    private int flagName;
    private int price;

    public Product(String productName, int flagName,String address, int price) {
        this.productName= productName;
        this.flagName= flagName;
        this.address=address;
        this.price= price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int population) {
        this.price = population;
    }

    public String getProductName() {
        return productName;
    }


    public int getFlagName() {
        return flagName;
    }

    public void setFlagName(int flagName) {
        this.flagName = flagName;
    }

    public String getAddress() {
        return address;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString()  {
        return this.productName+" "+ this.price;
    }
}

