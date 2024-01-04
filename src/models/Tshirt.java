package models;

import java.util.Arrays;

public class Tshirt {
    String name;
    String product_code;

    int price;

    String brand;

    String description;

    public Tshirt(String name, String product_code, int price, String brand, String description, String[] sizes) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    String[] sizes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    public void displayInformation(){

//        String name=this.name;
//        String product_code=this.product_code;
//        int price=this.price;
//        String brand=this.brand;
//        String description=this.description;
//        String[] sizes=this.sizes;

        System.out.println("name: " + getName());
        System.out.println("product_code: " + getProduct_code());
        System.out.println("price: " +getPrice());
        System.out.println("brand: " + getBrand());
        System.out.println("description :"+getDescription());
        System.out.println("sizes: "+ Arrays.toString(getSizes()));



    }


}
