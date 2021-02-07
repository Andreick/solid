package open.closed.principle.solution;

public class DiscountController
{
    public void addBookDiscount(DiscountBook discountBook)
    {
        discountBook.discountValue();
    }

    // no modifications
}
