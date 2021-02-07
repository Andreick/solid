package single.responsability.principle.solution;

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
}

