package model;

import interfaces.ICustomer;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements ICustomer {

    private Wallet wallet;
    private Cart cart;


    public Customer(Wallet wallet, Cart cart) {
        this.wallet = wallet;
        this.cart = cart;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    //    @Override
//    public void buyProducts(Store store) {
//        Cart cart = new Cart(null);
//        if(store != null && store.getProduct().contains(cart.getPurchasedProduct())){
//            store.getProduct().remove(cart.getPurchasedProduct());
//
//        }
//
//    }

    public List<Product> addNewProduct(Product product){
        cart.getPurchasedProduct().add(product);
        return cart.getPurchasedProduct();
    }

    @Override
    public void buyProduct(){
        List<Product> newProductList = new ArrayList<>();
         if (cart.getPurchasedProduct().size() > 0) {
             if(wallet.getAmount() >= cart.getTotalPriceOfCart() && cart.getTotalPriceOfCart() > 0){
                 float bal = wallet.getAmount() - cart.getTotalPriceOfCart();
                 wallet.setAmount(bal);
                 System.out.println("transaction complete");
             }
             else {
                 System.out.println("not sufficient fund");
             }
         }else {
             System.out.println("you have not selected any product yet");
         }

    }
}
