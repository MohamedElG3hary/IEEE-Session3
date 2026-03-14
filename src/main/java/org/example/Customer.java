package org.example;

public class Customer {


    private int balance;
    private int itemsCount;

    public Customer (){
     this.balance = 0;
     this.itemsCount = 0;
    }

    public Customer(int balance) {
        this.balance = balance;
        this.itemsCount = 0;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public int getBalance() {
        return balance;
    }

    public int getItemsCount() {
        return itemsCount;
    }


    public void purchase(Product product){
        boolean available = product.isInStock();
        int price = product.getPrice();
        if(available){
            if(this.balance >= price){
                this.balance -= price;
                this.itemsCount++;
                System.out.println("Book added to Cart ");
            }else {
                System.out.println("Not Enough balance for book ");
            }
        }else {
            System.out.println(product.getProductName() + " not is Stock");
        }
    }

}
