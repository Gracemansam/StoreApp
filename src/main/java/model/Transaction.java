package model;

import java.util.Date;
import java.util.List;


public class Transaction {
    private Customer customer;

    public Transaction( Customer customer) {

        this.customer = customer;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void printInvoice(){
        for(Product product : customer.getCart().purchasedProduct){
            System.out.println(product.getName() + " " + product.getQuantity() + " " + product.getPrice() );
        }
        System.out.println(" Total Amount"+ customer.getCart().getTotalPriceOfCart());
        System.out.println("Thanks for your patronage");
    }
}

