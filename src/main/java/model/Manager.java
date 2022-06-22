package model;

import enums.CashierRole;
import interfaces.IManager;

public class Manager extends Person implements IManager {

    private static Manager manager = new Manager();


        private Manager(){
            super();

        }
        public static Manager getInstance(){
        if(manager == null){
             manager = new Manager();
        }
        return manager;
    }

    @Override
    public void hireACashier(Cashier cashier) {
        if(cashier.getRole() == CashierRole.APPLICANT){
            if(cashier.getAccessmant() > 50){
                cashier.setRole(CashierRole.EMPLOYED);
                System.out.println("congratulations");
            }else{
                System.out.println("We are happy to announce to you that we have other positions " +
                        "available however your score does not meet the passmark for a cashier role. Thanks");
            }
        }
    }
}
