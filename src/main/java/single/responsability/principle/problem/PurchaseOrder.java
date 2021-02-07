package single.responsability.principle.problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder
{
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) { products.add(product); }
    public void removeProduct(Product product) { products.remove(product); }

    public BigDecimal calculateTotalPrice()
    {
        // return total purchase order price
        return new BigDecimal(0);
    }

    public List<PurchaseOrder> searchPurchaseOrder()
    {
        // return the purchase order list from the database
        return new ArrayList<>();
    }

    public void savePurchaseOrder()
    {
        // save the purchase order list to the database
    }

    public void sendEmail(String email)
    {
        // send email of purchase order
    }

    public void printPurchaseOrder()
    {
        // print the purchase order
    }
}
