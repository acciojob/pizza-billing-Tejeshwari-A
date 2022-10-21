package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheeseFlag = false,
                    toppingsFlag = false,
                    takeawayFlag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg)
            price = 300;
        else
            price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseFlag) {
            cheeseFlag = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        if(!toppingsFlag){
            toppingsFlag = true;

            if(isVeg)
                this.price += 70;
            else
                this.price += 120;
        }
    }

    public void addTakeaway(){
        if(!takeawayFlag) {
            takeawayFlag = true;
            this.price += 20;
        }
    }

    public String getBill(){
        int total = 0;

        if(isVeg) {
            bill = "Base Price Of The Pizza: 300 \n";
            total += 300;
        }
        else {
            bill = "Base Price Of The Pizza: 400 \n";
            total += 400;
        }

        if(cheeseFlag) {
            bill += "Extra Cheese Added: 80 \n";
            total += 80;
        }

        if(toppingsFlag) {
            if(isVeg) {
                bill += "Extra Toppings Added: 70 \n";
                total += 70;
            }
            else {
                bill += "Extra Cheese Added: 120 \n";
                total += 120;
            }
        }

        if(takeawayFlag) {
            bill += "Paperbag Added: 20 \n";
            total += 20;
        }

        bill += "Total Price: " + total + "\n";
        return this.bill;
    }
}
