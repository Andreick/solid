package open.closed.principle.problem;

public class DiscountController
{
    public void addDiscountChildrenBook(ChildrenBookDiscount childrenBookDiscount)
    {
        childrenBookDiscount.discountValue();
    }

    public void addDiscountSelfHelpBook(SelfHelpBookDiscount selfHelpBookDiscount)
    {
        selfHelpBookDiscount.discountValue();
    }

    // new method added
    public void addDiscountActionBook(ActionBookDiscount actionBookDiscount)
    {
        actionBookDiscount.discountValue();
    }
}
