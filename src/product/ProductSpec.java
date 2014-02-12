/*
 * CSC 668 SFSU
 * Project POST1
 * Team Ziga
 */

package product;

/**
 * ProductSpec holds info about a product
 * @author Team Ziga
 */
public class ProductSpec {
    
    String UPC;
    String description;
    double price;
    
    public ProductSpec(String UPC, String description, double price){
        this.UPC = UPC;
        this.description = description;
        this.price = price;
    }
    
    public String getUPC(){
        return UPC;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
}
