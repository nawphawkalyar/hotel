package com.example.hotelmanagementsystem.model;



public enum  RoomType {

    Delux("3 persons",200000),
    Luxury("3 persons",300000),
    Economy("3 persons",80000),
    ExtraBed("1 persons",30000)
;
   RoomType(String name,double price){
       this.name=name;
       this.price=price;
   }
    String name;
    double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
