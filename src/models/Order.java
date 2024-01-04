package models;

import java.util.Arrays;

public class Order {

    String name;

    int phonenumber;

    int[] items;

    int[] price;

    public Order(String name, int phonenumber, int[] items, int[] price) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.items = items;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public int getTotal() {
        int total = 0;
        for (int price : price) {
            total += price;
        }
        return total;
    }
    public void displayTotal() {
        System.out.println("name: " + getName());
        System.out.println("phonenumber: " + getPhonenumber());
        System.out.println("items: " + Arrays.toString(getItems()));
        System.out.println("price: " + Arrays.toString(getPrice()));
        System.out.println("Total Price after  Vat is: $" + getTotal()*0.13+ "\n");



    }



}
