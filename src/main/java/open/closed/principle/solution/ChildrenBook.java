package open.closed.principle.solution;

public class ChildrenBook implements DiscountBook
{
    @Override
    public double discountValue()
    {
        return 0.3;
    }
}
