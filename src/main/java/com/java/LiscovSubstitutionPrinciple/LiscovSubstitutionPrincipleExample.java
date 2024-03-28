package com.java.LiscovSubstitutionPrinciple;

public class LiscovSubstitutionPrincipleExample {

    public static class MenuItem {

        public String name;
        public String description;
        public int price;


        public MenuItem(String name, String description, int price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        public double getDiscount() {
            return 0;
        }

    }

    public static class BevarageItem extends MenuItem {

        public BevarageItem(String name, String description, int price) {
            super(name, description, price);
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        public double getDiscount() {
            int discount = 10;
            return discount * 0.01 * this.price;
        }
    }

    public static void main(String[] args) {

        MenuItem menuItem = new MenuItem("roti", "tandoori roti", 100);
        BevarageItem bevarageItem = new BevarageItem("butter milk", "butter milk", 100);

        getItemPrice(menuItem);
        getItemPrice(bevarageItem);

    }

    public static void getItemPrice(MenuItem menuItem) {
        if (menuItem instanceof BevarageItem) {
            System.out.print("This is a BeverageItem: ");
        } else {
            System.out.print("This is a MenuItem: ");
        }
        System.out.println(menuItem.getPrice());
    }

}
