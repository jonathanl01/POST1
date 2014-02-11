package post;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Team Ziga
 */
public class Invoice {
    private String storeName;
    private String customerName;
    private String dateTime;
    private ArrayList<TransactionItem> transactionItems;
    private String transactionTotal;
    private String amountTendered;
    private String amountReturned;
    
    private Transaction transaction;
    
    Invoice(Transaction transaction) {
        this.storeName = transaction.getTransHeader().getStoreName();
        this.customerName = transaction.getTransHeader().getcustomerName();
        this.dateTime = "still need to set time....";
        this.transactionTotal = Double.toString(transaction.getTotal());
        this.transactionItems = transaction.getTransItems();
    }
    
    
    @Override
    public String toString() {
        String invoiceString = "Store: " + this.storeName + "   " 
                + this.dateTime + "\n\n"
                + "Customer Name: " + this.customerName + "\n";
        
        double subtotal = 0;
        for(int i = 0; i < transactionItems.size(); i++) {
            TransactionItem item = transactionItems.get(i);
            subtotal += item.getExtendedPrice();
            invoiceString += "Item: " + item.getName()
                    + "   $" + item.getUnitPrice() + "     " + subtotal + "\n";
            
        }
        
        invoiceString += "Total: " + this.transactionTotal;
        return invoiceString;
    }
}