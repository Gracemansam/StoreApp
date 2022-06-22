package interfaces;

import model.Customer;
import model.Store;
import model.Transaction;

public interface ICashier {
    void sellProduct(Customer customer);
    void printReceipt(Transaction transaction);
}
