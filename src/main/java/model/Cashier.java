package model;


import enums.CashierRole;
import interfaces.ICashier;

import java.util.List;

public class Cashier extends Person implements ICashier {
   private CashierRole role;
   private Store store;
   private int accessmant;

   public Cashier(CashierRole role, int accessmant, String name) {
      this.role = role;
      this.accessmant = accessmant;
   }

   public CashierRole getRole() {
      return role;
   }

   public void setRole(CashierRole role) {
      this.role = role;
   }

   public Store getStore() {
      return store;
   }

   public void setStore(Store store) {
      this.store = store;
   }

   public int getAccessmant() {
      return accessmant;
   }

   public void setAccessmant(int accessmant) {
      this.accessmant = accessmant;
   }

   @Override
   public void sellProduct(Customer customer) {
      if(role == CashierRole.EMPLOYED){
         if(store.getProduct() != null && store.getProduct().contains(customer.getCart())){
            if(customer.getWallet().getAmount() >= customer.getCart().getTotalPriceOfCart())
               store.getProduct().remove(customer.getCart());
         }
      }else{
         System.out.println("you are unauthorized");
      }
   }

   @Override
   public void printReceipt(Transaction transaction) {
//      float totalPrice = transaction.getCustomer().getCart().getTotalPriceOfCart();
//      List<Product> list = transaction.getCustomer().getCart().getPurchasedProduct();
//      for(Product product : list){
//         System.out.println(product.getName() + ":" + product.getPrice());
//      }
//      System.out.println("Total price :" + totalPrice);
      transaction.printInvoice();

   }
}
