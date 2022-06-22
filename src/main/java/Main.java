import enums.CashierRole;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        Cashier cashier = new Cashier(CashierRole.EMPLOYED,60,"Osi");
        manager.hireACashier(cashier);
        Wallet wallet1 = new Wallet(2800);
        List<Product> listOfPurchasedProduct = new ArrayList<Product>();
        Cart cart1 = new Cart(listOfPurchasedProduct);
        Customer customer1 = new Customer(wallet1,cart1);
//        customer1.setWallet(wallet1);
        Product product1 = new Product("milk",3,400);
        Product product2 = new Product("milk",3,400);
        listOfPurchasedProduct.add(product1);
        listOfPurchasedProduct.add(product2);
        customer1.getCart().setPurchasedProduct(listOfPurchasedProduct);
        System.out.println(cart1.getTotalPriceOfCart());
        System.out.println(customer1.getWallet().getAmount());
        customer1.buyProduct();
        System.out.println(customer1.getWallet().getAmount());
        Transaction transaction1 = new Transaction(customer1);
        cashier.printReceipt(transaction1);


    }
}
